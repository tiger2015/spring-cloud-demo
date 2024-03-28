package com.tiger.consumer.service;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName: HelloService
 * @Author: Zeng.h
 * @Date: 2024/3/28
 * @Description:
 * @Version: 1.0
 **/
@FeignClient(name = "HELLO-SERVICE")
public interface HelloService {

    @GetMapping("/hello/{name}")
    @LoadBalanced
    String hello(@PathVariable("name") String name);
}
