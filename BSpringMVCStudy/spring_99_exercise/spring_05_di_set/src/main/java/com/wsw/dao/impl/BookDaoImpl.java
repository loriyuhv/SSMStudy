package com.wsw.dao.impl;

import com.wsw.dao.BookDao;

/**
 * @author loriyuhv
 * @ClassName BookDaoImpl
 * @date 2024/4/10 16:52
 * @description TODO
 */

public class BookDaoImpl implements BookDao {
    private String databaseName;
    private int connectionNum;

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    @Override
    public void save() {
        System.out.println("book dao save ..." + databaseName + ":" + connectionNum);
    }
}
