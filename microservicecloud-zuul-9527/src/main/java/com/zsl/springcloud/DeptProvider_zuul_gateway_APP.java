package com.zsl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //开启路由
public class DeptProvider_zuul_gateway_APP {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_zuul_gateway_APP.class, args);
    }
}
/**
 * 启用路由访问： http://myzuul.com/mivroservicecloud-dept/dept/get/1
 * myzuul.com  映射的localhost
 * mivroservicecloud-dept 是zuul自身注入到Eureka中，可以找到其他注册了的服务，来通过服务名称调用
 * */