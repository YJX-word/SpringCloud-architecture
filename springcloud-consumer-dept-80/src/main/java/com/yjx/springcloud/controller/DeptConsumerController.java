package com.yjx.springcloud.controller;

import com.yjx.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: Yjx
 * @Data: 2021/10/29 22:21
 * @Version 1.0
 * @Project_Name: springCloud
 * @describe
 */
@RestController
public class DeptConsumerController {
    // RestTemplate 供我们直接调用
    //(url,实体：map,Class<T> responseType)
    @Autowired
    private RestTemplate restTemplate;

//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @PostMapping("/consumer/dept/add")
    public Boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> getALL(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
    }

}
