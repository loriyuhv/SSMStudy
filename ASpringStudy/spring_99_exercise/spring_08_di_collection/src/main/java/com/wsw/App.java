package com.wsw;

import com.wsw.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/10 18:07
 * @description TODO
 */

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();
    }
}
