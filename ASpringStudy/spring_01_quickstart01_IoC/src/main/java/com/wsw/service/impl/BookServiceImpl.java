package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.dao.impl.BookDaoImpl;
import com.wsw.service.BookService;

public class BookServiceImpl implements BookService {
    private final BookDao bookDao = new BookDaoImpl();

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
