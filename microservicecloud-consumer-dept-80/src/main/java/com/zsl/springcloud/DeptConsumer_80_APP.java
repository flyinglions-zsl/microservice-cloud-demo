package com.zsl.springcloud;

import com.zsl.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient //ribbon负载均衡时添加
//在启动微服务时，能够自动去加载自定义的Ribbon配置类，从而使配置生效
//MyselfRule 不能再@ComponentScan(@SpringBootApplication里有) 同包及子包下。（即启动类的包及子包）
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MyselfRule.class)
public class DeptConsumer_80_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80_APP.class, args);
    }
}
