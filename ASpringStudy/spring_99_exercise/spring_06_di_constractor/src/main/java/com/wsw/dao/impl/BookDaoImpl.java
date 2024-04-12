package com.wsw.dao.impl;

import com.wsw.dao.BookDao;

/**
 * @author loriyuhv
 * @ClassName BookDaoImpl
 * @date 2024/4/10 17:12
 * @description TODO
 */

public class BookDaoImpl implements BookDao {
    private String databaseName;
    private int connectionNum;

    public BookDaoImpl(String databaseName, int connectionNum) {
        this.databaseName = databaseName;
        this.connectionNum = connectionNum;
    }

    @Override
    public void save() {
        System.out.println("book dao save ..." + databaseName + ":" + connectionNum);
    }
}
