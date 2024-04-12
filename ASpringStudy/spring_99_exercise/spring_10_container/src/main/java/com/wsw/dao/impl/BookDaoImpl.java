package com.wsw.dao.impl;

import com.wsw.dao.BookDao;

/**
 * @author loriyuhv
 * @ClassName BookDaoImpl
 * @date 2024/4/10 20:26
 * @description TODO
 */

public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
        System.out.println("constructor ...");
    }

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
