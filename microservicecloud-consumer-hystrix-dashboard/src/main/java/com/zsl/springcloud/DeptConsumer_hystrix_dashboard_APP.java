package com.zsl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_hystrix_dashboard_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_hystrix_dashboard_APP.class, args);
    }
}

/**
 * 只有添加了actuator依赖的模块才会被监控
 * */