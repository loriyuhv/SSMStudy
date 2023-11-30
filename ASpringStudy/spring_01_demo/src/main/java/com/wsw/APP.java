package com.wsw;

import com.wsw.service.BookService;
import com.wsw.service.impl.BookServiceImpl;

public class APP {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
