package com.zsl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //启动后会自动注册Eureka服务列表
@EnableDiscoveryClient //服务发现
public class DeptProvider_8001_APP {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8001_APP.class, args);
    }
}
