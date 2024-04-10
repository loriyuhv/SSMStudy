package com.wsw.dao.impl;

import com.wsw.dao.BookDao;

/**
 * @author loriyuhv
 * @ClassName BookDaoImpl
 * @date 2024/4/10 16:12
 * @description TODO
 */

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

    // 表示bean初始化对应的操作
    public void init() {
        System.out.println("init ...");
    }

    // 表示bean销毁前对应的操作
    public void destroy() {
        System.out.println("destroy ...");
    }
}
