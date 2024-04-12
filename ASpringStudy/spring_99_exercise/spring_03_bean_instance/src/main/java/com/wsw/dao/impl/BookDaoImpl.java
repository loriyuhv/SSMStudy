package com.wsw.dao.impl;

import com.wsw.dao.BookDao;

/**
 * @author loriyuhv
 * @ClassName BookDaoImpl
 * @date 2024/4/10 11:00
 * @description TODO
 */

public class BookDaoImpl implements BookDao {
    private BookDaoImpl() {
        System.out.println("book dao constructor is running ...");
    }

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
