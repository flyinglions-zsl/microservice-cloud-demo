package com.zsl.springcloud.controller;

import com.zsl.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {

   //单机版时 private static final String REST_URL_PRIFFIX = "http://localhost:8001";
    //通过微服务名来访问
    private static final String REST_URL_PRIFFIX = "http://MICROSERVICECLOUD-DEPT";
    /**
     * RestTemplate 访问 Restful接口非常的简单
     * （url,requestMap,ResponseBean.class）
     * url ---Rest请求地址
     * requestMap ---请求参数
     * ResponseBean.class ---Http响应转换被转换成的对象类型
     * */
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PRIFFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PRIFFIX+"/dept/list",List.class);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        return restTemplate.getForObject(REST_URL_PRIFFIX+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/discovery",method = RequestMethod.GET)
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PRIFFIX+"/dept/discovery/",Object.class);
    }
}
