package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Value("Jerry")
    private String name;

    @Value("${jdbc.username}")
    private String username;
    @Override
    public void save() {
        System.out.println("book dao save ... 2, name = " + name);
        System.out.println("username is " + username);
    }
}
