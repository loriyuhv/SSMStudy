package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author loriyuhv
 * @ClassName BookDaoImpl2
 * @date 2024/4/11 9:08
 * @description TODO
 */

@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao2 save ...");
    }
}
