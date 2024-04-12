package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.stereotype.Component;

/**
 * @author loriyuhv
 * @ClassName BookServiceImpl
 * @date 2024/4/10 20:53
 * @description TODO
 */

@Component
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
