package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * @author loriyuhv
 * @ClassName BookServiceImpl
 * @date 2024/4/11 9:04
 * @description TODO
 */

@Repository
public class BookServiceImpl implements BookService {
    // 推荐使用构造器注入
    // private final BookDao bookDao;
    //
    // public BookServiceImpl(BookDao bookDao) {
    //     this.bookDao = bookDao;
    // }

    @Autowired
    @Qualifier("bookDao2")
    private BookDao bookDao;

    // public void setBookDao(BookDao bookDao) {
    //     this.bookDao = bookDao;
    // }


    // private final BookDao bookDao;
    //
    // public BookServiceImpl(BookDao bookDao) {
    //     this.bookDao = bookDao;
    // }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
