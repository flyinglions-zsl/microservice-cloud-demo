package com.zsl.springcloud.controller;

import com.zsl.springcloud.entity.Dept;
import com.zsl.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @Autowired
    private DiscoveryClient client;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept){
        return service.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        return service.getone(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list(){
        return service.list();
    }

    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = client.getServices();

        List<ServiceInstance> serviceInstanceList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance instance : serviceInstanceList) {
            System.out.println(instance.getServiceId() + "\t"
                                + instance.getHost() +"\t"
                                + instance.getPort() +"\t"
                                + instance.getUri());
        }
        return  this.client;
    }
}
