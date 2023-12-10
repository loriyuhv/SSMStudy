package com.wsw.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void testUserRegister() {
        String userAccount;
        String userPassword;
        String checkPassword;
        // 1. 校验用户的账户，密码、校验密码是否符合要求
        // 1) 非空
        userAccount = "Jerry";
        userPassword = "";
        checkPassword = "12345678";
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        // 2) 账户的话不小于4位
        userAccount = "Tom";
        userPassword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        // 3) 密码不小于8位
        userAccount = "Alice";
        userPassword = "123456";
        checkPassword = "123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        // 4) 账户不包含特殊字符
        userAccount = "@Alice";
        userPassword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        // 5) 密码和校验密码相同
        userAccount = "Jerry";
        userPassword = "12345678";
        checkPassword = "12345679";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        // 6) 账户不能重复
        userAccount = "Alice";
        userPassword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        // 3. 对密码进行加密（密码千万不要直接以明文存储到数据库中）
        // 4. 向数据库插入用户数据
        userAccount = "Jerry";
        userPassword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertTrue(result > 0);
        System.out.println(result);
        System.out.println("success!!!");
    }
}