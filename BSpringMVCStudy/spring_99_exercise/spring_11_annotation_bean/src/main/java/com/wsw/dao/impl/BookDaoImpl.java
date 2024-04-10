package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import org.springframework.stereotype.Component;

/**
 * @author loriyuhv
 * @ClassName BookDaoImpl
 * @date 2024/4/10 20:51
 * @description TODO
 */

@Component("bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save...");
    }
}
