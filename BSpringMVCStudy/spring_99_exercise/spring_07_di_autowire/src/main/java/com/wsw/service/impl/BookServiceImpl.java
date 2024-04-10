package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.service.BookService;

/**
 * @author loriyuhv
 * @ClassName BookServiceImpl
 * @date 2024/4/10 17:45
 * @description TODO
 */

public class BookServiceImpl implements BookService {
    private BookDao bookDao2;

    public void setBookDao(BookDao bookDao) {
        this.bookDao2 = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao2.save();
    }
}
