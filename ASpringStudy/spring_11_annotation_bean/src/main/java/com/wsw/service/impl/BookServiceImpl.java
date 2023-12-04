package com.wsw.service.impl;

import com.wsw.service.BookService;
import org.springframework.stereotype.Component;

@Component
public class BookServiceImpl implements BookService {

    @Override
    public void save() {
        System.out.println("book service save ...");
    }
}
