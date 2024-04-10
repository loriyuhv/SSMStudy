package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/10 20:52
 * @description TODO
 */

public class App {
    public static void main(String[] args) {
        // ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = context.getBean(BookDao.class);
        System.out.println(bookDao);
        // bookDao.save();
        // BookService bookService = context.getBean(BookService.class);
        BookService bookService = (BookService) context.getBean("bookServiceImpl");
        System.out.println(bookService);
        // bookService.save();
    }
}
