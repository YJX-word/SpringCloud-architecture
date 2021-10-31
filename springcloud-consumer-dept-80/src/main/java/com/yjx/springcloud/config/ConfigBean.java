package com.yjx.springcloud.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Yjx
 * @Data: 2021/10/29 22:25
 * @Version 1.0
 * @Project_Name: springCloud
 * @describe
 */
@Configuration
public class ConfigBean {
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
