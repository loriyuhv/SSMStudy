package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

// @Repository("bookDao")
@Repository("bookDao1")
@Primary
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
