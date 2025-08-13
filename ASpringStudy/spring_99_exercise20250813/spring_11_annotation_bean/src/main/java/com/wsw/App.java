package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author loriyuhv
 * @date 2025/8/13
 * @description 运行类
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = context.getBean(BookDao.class);
        bookDao.save();
        BookService bookService = context.getBean(BookService.class);
        bookService.save();
    }
}
