package com.wsw;

import com.wsw.service.BookService;
import com.wsw.service.impl.BookServiceImpl;

/**
 * @author loriyuhv
 * @date 2025/8/22
 * @description
 */
public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
