package com.wsw.factory;

import com.wsw.dao.UserDao;
import com.wsw.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
