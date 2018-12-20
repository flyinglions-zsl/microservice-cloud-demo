package com.zsl.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //实现客户端的 负载均衡的工具
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /*@Bean
    public IRule myRule(){
        return  new RandomRule();//随机算法,会替代轮询算法
        //return new RetryRule(); 默认是轮询，如果有某个服务访问几次，无法访问，则会去掉该服务的访问
    }*/
}

