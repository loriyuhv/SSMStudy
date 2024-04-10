package com.wsw.dao.impl;

import com.wsw.dao.UserDao;

/**
 * @author loriyuhv
 * @ClassName UserDaoImpl
 * @date 2024/4/10 19:45
 * @description TODO
 */

public class UserDaoImpl implements UserDao {
    private String username;
    private String driver;
    private String rectangle;

    public void setRectangle(String rectangle) {
        this.rectangle = rectangle;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void save() {
        System.out.println("user dao save ..." + username);
        System.out.println("driver: " + driver);
        System.out.println("rectangle: " + rectangle);
    }
}
