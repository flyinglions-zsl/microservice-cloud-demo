package com.zsl.springcloud.service;

import com.zsl.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //重要，重要，重要
public class DeptClientServiceFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id).setDname("该"+id+"consumer客户端提供的降级信息").setDb_source("没有数据库信息");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
