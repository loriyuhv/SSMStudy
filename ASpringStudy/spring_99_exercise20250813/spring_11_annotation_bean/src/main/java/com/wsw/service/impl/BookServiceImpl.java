package com.wsw.service.impl;

import com.wsw.service.BookService;
import org.springframework.stereotype.Component;

/**
 * @author loriyuhv
 * @date 2025/8/13
 * @description BookService实现类
 */
@Component
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service save ...");
    }
}
