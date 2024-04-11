package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/11 8:36
 * @description TODO
 */


public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = context.getBean(BookDao.class);
        context.registerShutdownHook();

    }
}
