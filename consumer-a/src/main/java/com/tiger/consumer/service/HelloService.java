package com.tiger.consumer.service;

import com.tiger.consumer.config.HelloServiceLoadBalanceConfig;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
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
@FeignClient(name = "hello-service")
@LoadBalancerClient(name = "hello-service", configuration = {HelloServiceLoadBalanceConfig.class})
public interface HelloService {

    @GetMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);
}
