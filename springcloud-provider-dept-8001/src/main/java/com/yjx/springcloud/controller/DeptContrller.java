package com.yjx.springcloud.controller;

import com.yjx.springcloud.pojo.Dept;
import com.yjx.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Yjx
 * @Data: 2021/10/29 20:42
 * @Version 1.0
 * @Project_Name: springCloud
 * @describe
 */
@RestController
public class DeptContrller {
    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public Boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id) throws Exception{
        Dept dept = deptService.queryById(id); //mybatis如果没有结果会出异常，但是不会阻碍程序的运行
        if(dept == null){
            throw new RuntimeException("返回结果为null");
        }
        System.out.println("运行到这里来了");
        return dept;
    }

    @GetMapping("/dept/list")
    public List<Dept> queryALl(){
        return deptService.queryALl();
    }

    @GetMapping("/dept/discovery")
    public Object disCovery(){

        //获取所有的服务
        List<String> services = client.getServices();
        System.out.println("discovery=>services"+services);

        //得到具体的微服务信息，通过具体的微服务Id,
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");

        for(ServiceInstance instance:instances){
            System.out.println(
                    instance.getHost()+"\t"+
                    instance.getPort()+"\t"+
                    instance.getUri()+"\t"+
                    instance.getServiceId()
            );
        }

        return this.client;
    }
}
