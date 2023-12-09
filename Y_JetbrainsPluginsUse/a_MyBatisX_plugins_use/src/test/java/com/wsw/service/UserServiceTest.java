package com.wsw.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wsw.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    void testGetAll() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", 1);
        User one = userService.getOne(queryWrapper);
        System.out.println(one);
    }

}