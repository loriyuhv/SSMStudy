package com.wsw;

import com.wsw.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/10 16:55
 * @description TODO
 */

public class AppForDiSet {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean(BookService.class);
        bookService.save();

    }
}
