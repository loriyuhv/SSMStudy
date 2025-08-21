package com.wsw.service.impl;

import com.wsw.dao.UserDao;
import com.wsw.domain.User;
import com.wsw.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author loriyuhv
 * @date 2025/8/21
 * @description
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(User user) {
        userDao.save(user);
        System.out.println("user service save ...");
    }
}
