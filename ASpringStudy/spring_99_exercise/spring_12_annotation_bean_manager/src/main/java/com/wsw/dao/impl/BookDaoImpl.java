package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author loriyuhv
 * @ClassName BookDaoImpl
 * @date 2024/4/11 8:38
 * @description TODO
 */

@Repository
@Scope("prototype")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

    @PostConstruct
    public void init() {
        System.out.println("init ...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy ...");
    }
}
