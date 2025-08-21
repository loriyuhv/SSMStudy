package com.wsw.dao.impl;

import com.wsw.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author loriyuhv
 * @date 2025/8/21
 * @description
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("user dao save ...");
    }
}
