package com.yjx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //在服务启动后，自动注册到Eureka中
@EnableDiscoveryClient  //服务发现
@EnableCircuitBreaker //Hystrix服务熔断
public class SpringcloudProviderHystrix8002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProviderHystrix8002Application.class, args);
    }

}
