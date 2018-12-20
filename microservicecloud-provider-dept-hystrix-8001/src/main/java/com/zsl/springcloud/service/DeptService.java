package com.zsl.springcloud.service;

import com.zsl.springcloud.entity.Dept;

import java.util.List;

public interface DeptService {
    public boolean add(Dept dept);

    public Dept getone(Long id);

    public List<Dept> list();
}
