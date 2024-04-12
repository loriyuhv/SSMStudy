package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import com.wsw.service.BookService;

/**
 * @author loriyuhv
 * @ClassName BookDaoImpl2
 * @date 2024/4/10 17:59
 * @description TODO
 */

public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao2 save ...");
    }
}
