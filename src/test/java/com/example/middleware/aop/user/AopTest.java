package com.example.middleware.aop.user;

import com.example.middleware.aop.proxy.AopProxyFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AopTest {

    @Test
    public void testAddUser() {
        // 创建代理对象
        UserService userService = AopProxyFactory.createProxy(
                UserService.class,
                "com.example.middleware.aop.user");

        // 正常调用
        assertDoesNotThrow(() -> userService.addUser("张三"));
    }

    @Test
    public void testAddUserWithInvalidUsername() {
        // 创建代理对象
        UserService userService = AopProxyFactory.createProxy(
                UserService.class,
                "com.example.middleware.aop.user");

        // 异常调用
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> userService.addUser(""));

        assertEquals("用户名不能为空", exception.getMessage());
    }
}