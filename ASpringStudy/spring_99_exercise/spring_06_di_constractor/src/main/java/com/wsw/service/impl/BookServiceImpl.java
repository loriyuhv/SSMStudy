package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.dao.UserDao;
import com.wsw.service.BookService;

/**
 * @author loriyuhv
 * @ClassName BookServiceImpl
 * @date 2024/4/10 17:13
 * @description TODO
 */

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    // public void setBookDao(BookDao bookDao) {
    //     this.bookDao = bookDao;
    // }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }
}
