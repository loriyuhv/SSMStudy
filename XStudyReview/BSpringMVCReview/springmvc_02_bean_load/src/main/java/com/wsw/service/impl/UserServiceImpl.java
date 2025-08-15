package com.wsw.service.impl;

import com.wsw.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author loriyuhv
 * @date 2025/8/15
 * @description UserService实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.println("user service save ...");
    }
}
