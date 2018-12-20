package com.zsl.springcloud.service;

import com.zsl.springcloud.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


//Feign 负载均衡
//@FeignClient(value = "MICROSERVICECLOUD-DEPT") 没有Hystrix时
//有Hystrix熔断
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFactory.class)
public interface DeptClientService {

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept);

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable Long id);

    @GetMapping(value = "/dept/list")
    public List<Dept> list();
}
