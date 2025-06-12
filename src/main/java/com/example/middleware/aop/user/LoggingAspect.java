package com.example.middleware.aop.user;

import com.example.middleware.aop.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {
    private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("addUser")
    public void beforeAddUser() {
        log.info("【前置通知】准备添加用户");
    }

    @After("addUser")
    public void afterAddUser() {
        log.info("【后置通知】添加用户完成");
    }

    @AfterThrowing("addUser")
    public void afterThrowingAddUser(Throwable ex) {
        log.error("【异常通知】添加用户异常: {}", ex.getMessage());
    }
}