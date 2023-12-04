package com.wsw.dao.impl;

import com.wsw.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private String databaseName;
    private int connectionNum;
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
