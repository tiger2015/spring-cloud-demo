package com.tiger.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: ServiceA
 * @Author: Zeng.h
 * @Date: 2024/3/28
 * @Description:
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class ServiceA {

    public static void main(String[] args) {
        new SpringApplication(ServiceA.class).run(args);
    }


}
