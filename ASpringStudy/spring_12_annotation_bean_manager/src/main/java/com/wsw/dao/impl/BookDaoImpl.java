package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("bookDao")
// Scope注解：配置bean的作用范围：prototype：原型 singleton：单例（默认）
// @Scope("prototype")
@Scope("singleton")
public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
        System.out.println("BookDaoImpl is constructed ...");
    }

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

    @PostConstruct  // 在构造方法之后执行，替换 init-method
    public void init() {
        System.out.println("init ...");
    }
    @PreDestroy     // 在销毁方法之前执行,替换 destroy-method
    public void destroy() {
        System.out.println("destroy ...");
    }

}
