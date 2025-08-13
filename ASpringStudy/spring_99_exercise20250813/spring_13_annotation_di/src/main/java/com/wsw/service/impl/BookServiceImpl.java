package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author loriyuhv
 * @date 2025/8/13
 * @description BookService接口实现类
 */
@Service
public class BookServiceImpl implements BookService {
    // 推荐构造器注入
    // private final BookDao bookDao;
    //
    // public BookServiceImpl(@Qualifier("bookDao2") BookDao bookDao) {
    //     this.bookDao = bookDao;
    // }

    @Autowired
    @Qualifier("bookDao2")
    private BookDao bookDao;

    // public void setBookDao(BookDao bookDao) {
    //     this.bookDao = bookDao;
    // }

    @Override
    public void save() {
        System.out.println("book service save ....");
        bookDao.save();
    }
}
