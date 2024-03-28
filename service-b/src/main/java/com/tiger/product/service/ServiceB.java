package com.tiger.product.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: ServiceB
 * @Author: Zeng.h
 * @Date: 2024/3/28
 * @Description:
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class ServiceB {

    public static void main(String[] args) {
        new SpringApplication(ServiceB.class).run(args);
    }
}
