package com.wsw;

import com.wsw.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDiConstructor {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService userService = (BookService) context.getBean("bookService");
        userService.save();
    }
}