package com.example.middleware.aop.user;

public class UserServiceImpl implements UserService {
    @Override
    public void addUser(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("用户名不能为空");
        }
        System.out.println("添加用户: " + username);
    }
}