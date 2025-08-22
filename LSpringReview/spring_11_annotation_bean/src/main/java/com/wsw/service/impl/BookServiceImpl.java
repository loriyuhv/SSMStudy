package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.dao.impl.BookDaoImpl;
import com.wsw.service.BookService;
import org.springframework.stereotype.Component;

/**
 * @author loriyuhv
 * @date 2025/8/22
 * @description
 */
@Component("bookService")
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        BookDao bookDao = new BookDaoImpl();
        bookDao.save();
        System.out.println("book service save ...");
    }
}
