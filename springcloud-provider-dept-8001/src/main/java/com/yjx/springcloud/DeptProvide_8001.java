package com.yjx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Yjx
 * @Data: 2021/10/29 20:47
 * @Version 1.0
 * @Project_Name: springCloud
 * @describe
 */
@SpringBootApplication
@EnableEurekaClient  //在服务启动后，自动注册到Eureka中
@EnableDiscoveryClient  //服务发现
public class DeptProvide_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvide_8001.class,args);
    }
}
