package com.wsw.dao.impl;

import com.wsw.dao.BookDao;

/**
 * @author loriyuhv
 * @ClassName BookDaoImpl
 * @date 2024/4/10 9:43
 * @description
 */

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
