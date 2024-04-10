package com.wsw;

import com.wsw.service.BookService;
import com.wsw.service.impl.BookServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/10 17:43
 * @description TODO
 */

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.save();
    }
}
