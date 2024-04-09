package com.wsw.service.impl;

import com.wsw.domain.User;
import com.wsw.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author loriyuhv
 * @ClassName UserServiceImpl
 * @date 2024/4/9 19:47
 * @description 用户业务逻辑处理类
 */

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
        System.out.println("user service ....");
    }
}
