package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.controller.BookController;
import com.wsw.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author loriyuhv
 * @date 2025/8/23
 * @description
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = context.getBean(BookService.class);
        bookService.save();

        BookController bean = context.getBean(BookController.class);
        System.out.println(bean);
    }
}
