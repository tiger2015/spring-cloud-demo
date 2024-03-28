package com.tiger.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: RegisterApp
 * @Author: Zeng.h
 * @Date: 2024/3/28
 * @Description:
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class RegisterServiceA {

    public static void main(String[] args) {
        new SpringApplication(RegisterServiceA.class).run(args);
    }
}
