package com.zsl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DeptConsumer_cloud_config_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_cloud_config_APP.class, args);
    }
}
