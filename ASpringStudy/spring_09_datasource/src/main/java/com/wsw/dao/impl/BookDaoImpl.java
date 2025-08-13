package com.wsw.dao.impl;

import com.wsw.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void save() {
        System.out.println("book dao save ...\nname:" + username);
    }
}
