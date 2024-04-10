package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.dao.UserDao;
import com.wsw.service.BookService;

/**
 * @author loriyuhv
 * @ClassName BookServiceImpl
 * @date 2024/4/10 16:53
 * @description TODO
 */

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;


    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("book service ...");
        bookDao.save();
        userDao.save();
    }
}
