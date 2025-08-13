package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import org.springframework.stereotype.Component;

/**
 * @author loriyuhv
 * @date 2025/8/13
 * @description BookDao接口实现类
 */
@Component
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ....");
    }
}
