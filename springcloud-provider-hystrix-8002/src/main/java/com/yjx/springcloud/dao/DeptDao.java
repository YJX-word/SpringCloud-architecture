package com.yjx.springcloud.dao;

import com.yjx.springcloud.pojo.Dept;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Yjx
 * @Data: 2021/10/29 20:28
 * @Version 1.0
 * @Project_Name: springCloud
 * @describe
 */
@Mapper
@Repository
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryALl();
}
