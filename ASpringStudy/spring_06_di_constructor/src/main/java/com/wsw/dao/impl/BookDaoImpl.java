package com.wsw.dao.impl;

import com.wsw.dao.BookDao;

public class BookDaoImpl implements BookDao {
    // 步骤1. 添加多个简单属性并提供构造方法
    private final String databaseName;
    private final int connectionNum;

    public BookDaoImpl(String databaseName, int connectionNum) {
        this.databaseName = databaseName;
        this.connectionNum = connectionNum;
    }

    @Override
    public void save() {
        System.out.println("book dao save ...");
        System.out.println("数据库：" + databaseName + "\n连接池数量：" + connectionNum);
    }
}
