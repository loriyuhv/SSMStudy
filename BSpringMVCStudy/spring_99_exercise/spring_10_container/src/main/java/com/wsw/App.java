package com.wsw;

import com.wsw.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/10 20:22
 * @description TODO
 */

public class App {
    public static void main(String[] args) {
        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("F:\\IdeaProjects\\Repositories\\SSMStudy\\BSpringMVCStudy\\spring_99_exercise\\spring_10_container\\src\\main\\resources\\application.xml");

        // BookDao bookDao = (BookDao) context.getBean("bookDao");
        // BookDao bookDao = context.getBean("bookDao", BookDao.class);
        BookDao bookDao = context.getBean(BookDao.class);
        bookDao.save();
    }
}
