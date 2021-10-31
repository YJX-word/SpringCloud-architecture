package com.yjx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: Yjx
 * @Data: 2021/10/29 22:37
 * @Version 1.0
 * @Project_Name: springCloud
 * @describe
 */
@SpringBootApplication
//@RibbonClient(name = "foo")
@EnableEurekaClient
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class,args);
    }
}
