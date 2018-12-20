package com.zsl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //标志Eureka server端
public class EurekaServer_7002_APP {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7002_APP.class, args);
    }
}
