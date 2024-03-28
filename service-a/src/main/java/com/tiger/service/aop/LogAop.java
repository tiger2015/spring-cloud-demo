package com.tiger.service.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.DecimalFormat;

/**
 * @ClassName: LogAOP
 * @Author: Zeng.h
 * @Date: 2024/3/28
 * @Description:
 * @Version: 1.0
 **/
@Aspect
@Component
@Slf4j
public class LogAop {

    private static DecimalFormat decimalFormat = new DecimalFormat("#.###");

    @Pointcut(value = "execution(* com.tiger.service.controller.*.*(..))")
    public void log() {
    }

    @Around(value = "log()")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();
        HttpServletRequest request =
                ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        log.info("request:{}", request.getRequestURI());
        Object ret = joinPoint.proceed();
        long end = System.nanoTime();
        log.info("request cost:{} ms", decimalFormat.format((end - start) / 1000.0 / 1000.0));
        return ret;
    }

}
