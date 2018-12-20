package com.zsl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //启动后会自动注册Eureka服务列表
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker //对Hystrix的支持，熔断机制
public class DeptProvider_hystrix_8001_APP {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_hystrix_8001_APP.class, args);
    }
}
