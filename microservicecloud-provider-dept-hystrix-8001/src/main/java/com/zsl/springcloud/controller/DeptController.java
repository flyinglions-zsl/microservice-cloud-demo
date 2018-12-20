package com.zsl.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zsl.springcloud.entity.Dept;
import com.zsl.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeptController {

    @Autowired
    private DeptService service = null;

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    //一旦调用服务方法并抛出了异常之后，会自动调用@HystrixCommand标注好的fallbackMethod指定的方法
    @HystrixCommand(fallbackMethod = "processHystrix_get")
    public Dept get(@PathVariable Long id){
        Dept dept = service.getone(id);
        if (dept == null){
            throw new RuntimeException("当前ID：" + id + "无数据");
        }
        return dept;
    }

    public Dept processHystrix_get(@PathVariable Long id){
        return new Dept().setDeptno(id).setDname("该"+id+"无数据").setDb_source("没有数据库信息");
    }
}
