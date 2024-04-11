package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/11 9:02
 * @description TODO
 */

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // BookDao bookDao = context.getBean(BookDao.class);
        // bookDao.save();
        BookService bookService = context.getBean(BookService.class);
        bookService.save();
    }
}
