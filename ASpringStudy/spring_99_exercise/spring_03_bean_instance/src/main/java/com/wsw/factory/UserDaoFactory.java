package com.wsw.factory;

import com.wsw.dao.UserDao;
import com.wsw.dao.impl.UserDaoImpl;

/**
 * @author loriyuhv
 * @ClassName UserDaoFactory
 * @date 2024/4/10 15:50
 * @description TODO
 */

public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
