package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.dao.impl.BookDaoImpl;
import com.wsw.service.BookService;

/**
 * @author loriyuhv
 * @ClassName BookServiceImpl
 * @date 2024/4/10 9:48
 * @description TODO
 */

public class BookServiceImpl implements BookService {
    BookDao bookDao = new BookDaoImpl();
    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
