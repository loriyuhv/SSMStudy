package com.wsw.dao.impl;

import com.wsw.dao.BookDao;

public class BookDaoImpl implements BookDao {
    // 1. 类中提供构造函数测试
    private BookDaoImpl() {
        System.out.println("book dao constructor is running!!!");
    }

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
