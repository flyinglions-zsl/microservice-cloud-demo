package com.zsl.springcloud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true) //fluent = false控制setter/getter方法有无前缀 chain = true 控制set方法的返回类型，true为this，false为void
public class Dept implements Serializable {

    private Long deptno;
    private String dname;
    private String db_source;//来自哪个数据库
}
