package com.yjx.springcloud.service;

import com.yjx.springcloud.dao.DeptDao;
import com.yjx.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Yjx
 * @Data: 2021/10/29 20:39
 * @Version 1.0
 * @Project_Name: springCloud
 * @describe
 */
@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    DeptDao deptDao;
    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> queryALl() {
        return deptDao.queryALl();
    }
}
