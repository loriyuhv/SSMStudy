package com.wsw;

import com.wsw.dao.BookDao;
import com.wsw.dao.UserDao;
import com.wsw.domain.User;
import com.wsw.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/10 10:18
 * @description TODO
 */

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        // bookService.save();

        BookDao bookDao1 = (BookDao) context.getBean("dao");
        // bookDao1.save();
        BookDao bookDao2 = (BookDao) context.getBean("bookDaoImpl");
        // bookDao2.save();

        UserDao userDao = (UserDao) context.getBean("userDao");
        UserDao userDao1 = (UserDao) context.getBean("userDao");
        System.out.println(userDao);
        System.out.println(userDao1);

        User user = userDao.get();
        System.out.println("user dao ===> " +user);
        userDao.set(new User("Tom", 23));
        User user2 = userDao.get();
        System.out.println("user dao ===>" + user2);
        User user1 = userDao1.get();
        System.out.println("user dao1 ===> " + user1);
    }
}
