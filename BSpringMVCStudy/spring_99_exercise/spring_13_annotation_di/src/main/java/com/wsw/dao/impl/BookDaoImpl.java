package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author loriyuhv
 * @ClassName BookDaoImpl
 * @date 2024/4/11 9:01
 * @description TODO
 */

@Repository("bookDao")
@Primary
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
