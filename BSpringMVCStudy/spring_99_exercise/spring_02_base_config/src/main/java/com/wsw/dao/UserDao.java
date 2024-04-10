package com.wsw.dao;

import com.wsw.domain.User;

/**
 * @author loriyuhv
 * @ClassName UserDao
 * @date 2024/4/10 10:30
 * @description TODO
 */

public interface UserDao {
    void save();

    User get();

    void set(User user);
}
