package com.yjx.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: Yjx
 * @Data: 2021/10/29 19:55
 * @Version 1.0
 * @Project_Name: springCloud
 * @describe
 */
@Data
@NoArgsConstructor
@Accessors(chain = true) //链式写法
public class Dept implements Serializable {
    private Long deptno;//主键
    private String dname;
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

    /*
    链式写法：
    Dept dept = new Dept();
    dept.setDpetNo(11).setDname("dfsf")
     */
}
