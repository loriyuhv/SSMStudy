package com.wsw.dao.impl;

import com.wsw.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
        System.out.println("book dao constructor is running ...");
    }

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
