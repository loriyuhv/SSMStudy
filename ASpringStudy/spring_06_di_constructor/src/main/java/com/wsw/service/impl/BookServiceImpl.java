package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.dao.UserDao;
import com.wsw.service.BookService;

public class BookServiceImpl implements BookService {
    private final BookDao bookDao;
    private final UserDao userDao;
    // 1.将bookDao的setter方法删除掉
    // public void setBookDao(BookDao bookDao) {
    //     this.bookDao = bookDao;
    // }

    // 2.添加带有bookDao参数的构造方法
    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }
}
