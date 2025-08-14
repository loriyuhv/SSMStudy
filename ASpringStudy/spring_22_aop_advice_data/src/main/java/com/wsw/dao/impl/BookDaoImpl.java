package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id, String password) {
        System.out.println("id:" + id);
        int i = 10 / 0;
        return "Jerry";
    }
}
