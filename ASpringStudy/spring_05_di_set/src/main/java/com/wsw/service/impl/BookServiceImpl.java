package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.service.BookService;

public class BookServiceImpl implements BookService {
    // 注入引用类型
    // 1.在BookServiceImpl中声明bookDao属性
    private BookDao bookDao;
    // 2.为bookDao属性提供setter方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    // 注入简单类型
    // 1.在BookDaoImpl类中声明对应的简单数据类型的属性
    private int connectNumber;

    // 2.为这些属性提供对应的setter方法
    public void setConnectNumber(int connectNumber) {
        this.connectNumber = connectNumber;
    }

    @Override
    public void save() {
        System.out.println("连接池数量为" + connectNumber);
        System.out.println("book service save ...");
        bookDao.save();
    }
}
