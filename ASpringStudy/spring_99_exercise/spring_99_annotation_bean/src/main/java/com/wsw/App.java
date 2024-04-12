package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/11 8:30
 * @description TODO
 */

public class App {
    public static void main(String[] args) {
        // ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = context.getBean(BookDao.class);
        bookDao.save();

    }
}
