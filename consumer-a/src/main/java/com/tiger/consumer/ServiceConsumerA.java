package com.tiger.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: ${NAME}
 * @Author: Zeng.h
 * @Date: ${DATE}
 * @Description:
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ServiceConsumerA {
    public static void main(String[] args) {
        new SpringApplication(ServiceConsumerA.class).run(args);
    }
}