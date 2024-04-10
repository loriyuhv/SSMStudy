package com.wsw.dao.impl;

import com.wsw.dao.UserDao;
import com.wsw.domain.User;

import java.util.Random;

/**
 * @author loriyuhv
 * @ClassName UserDaoImpl
 * @date 2024/4/10 10:33
 * @description TODO
 */

public class UserDaoImpl implements UserDao {
    private User user;

    private UserDaoImpl() {
        user = new User("Jerry", 18);
    }

    @Override
    public void save() {
        System.out.println("user save ...");
    }

    @Override
    public User get() {
        return user;
    }

    @Override
    public void set(User user) {
        this.user = user;
    }
}
