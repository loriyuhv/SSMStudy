package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    // 推荐使用构造器注入，构造器注入时，如果有同类型多个bean注入，为了解决类型冲突
    //      需要使用@Primary指定主要bean。
    private final BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    // @Autowired
    // @Qualifier("bookDao2")
    // private BookDao bookDao;

    // public void setBookDao(BookDao bookDao) {
    //     this.bookDao = bookDao;
    // }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
