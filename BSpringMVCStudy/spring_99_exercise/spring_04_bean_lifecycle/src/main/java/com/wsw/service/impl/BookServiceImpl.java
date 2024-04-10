package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author loriyuhv
 * @ClassName BookServiceImpl
 * @date 2024/4/10 16:11
 * @description TODO
 */

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        System.out.println("set bookDao ...");
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("book service destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("book service init ...");
    }
}
