package com.wsw;

import com.wsw.service.BookService;
import com.wsw.service.impl.BookServiceImpl;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/10 9:45
 * @description TODO
 */

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
