package com.wsw.dao.impl;

import com.wsw.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * @author loriyuhv
 * @date 2025/8/17
 * @description
 */
@Repository
public class UserDaoImpl implements UserDao {
    private final DataSource ds;

    public UserDaoImpl(DataSource ds) {
        this.ds = ds;
    }

    @Override
    public void save() {
        System.out.println("user dao save ...");
        System.out.println(ds);
    }
}
