package com.tiger.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Author: Zeng.h
 * @Date: 2024/3/28
 * @Description:
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "hello world, " + name;
    }
}
