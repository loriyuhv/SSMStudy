package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.service.BookService;

public class BookServiceImpl implements BookService {
    // 5. 删除业务层中使用new的方式创建的dao对象
    // private BookDao bookDao = new BookDaoImpl();
    private BookDao bookDao;

    // 6. 为属性提供setter方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
