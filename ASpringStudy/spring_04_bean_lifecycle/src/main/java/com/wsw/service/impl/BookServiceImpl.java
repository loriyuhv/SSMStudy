package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private String name;
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public BookServiceImpl() {
        System.out.println("book service constructor ...");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("book service destroy ...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("name：" + this.name);
        System.out.println("book service init ...");
    }
}
