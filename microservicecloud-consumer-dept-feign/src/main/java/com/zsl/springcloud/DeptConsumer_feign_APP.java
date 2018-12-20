package com.zsl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient //ribbon负载均衡时添加
@EnableFeignClients(basePackages = "com.zsl.springcloud") //启动
@ComponentScan(value = "com.zsl.springcloud")
public class DeptConsumer_feign_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_feign_APP.class, args);
    }
}
