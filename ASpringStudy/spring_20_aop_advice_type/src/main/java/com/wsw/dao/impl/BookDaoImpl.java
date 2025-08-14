package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description BookDao实现类
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void update() {
        System.out.println("book dao update is running...");
    }

    @Override
    public int select() {
        System.out.println("book dao select is running...");
        double i = 10 / 0;
        return 10;
    }
}
