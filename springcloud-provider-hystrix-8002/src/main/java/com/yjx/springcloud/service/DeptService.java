package com.yjx.springcloud.service;

import com.yjx.springcloud.pojo.Dept;

import java.util.List;

/**
 * @Author: Yjx
 * @Data: 2021/10/29 20:39
 * @Version 1.0
 * @Project_Name: springCloud
 * @describe
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryALl();
}
