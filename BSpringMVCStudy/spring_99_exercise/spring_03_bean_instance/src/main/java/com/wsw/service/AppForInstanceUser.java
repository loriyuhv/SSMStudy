package com.wsw.service;

import com.wsw.dao.UserDao;
import com.wsw.factory.UserDaoFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @ClassName AppForInstanceUser
 * @date 2024/4/10 15:51
 * @description TODO
 */

public class AppForInstanceUser {
    public static void main(String[] args) {
        // // 创建实例工厂对象
        // UserDaoFactory userDaoFactory = new UserDaoFactory();
        // // 通过实例工厂对象创建对象
        // UserDao userDao = userDaoFactory.getUserDao();
        // userDao.save();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        UserDao userDao1 = (UserDao) context.getBean("userDao");
        userDao.save();
        System.out.println(userDao1);
        System.out.println(userDao);


    }
}
