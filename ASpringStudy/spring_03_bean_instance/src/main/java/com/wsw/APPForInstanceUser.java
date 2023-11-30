package com.wsw;

import com.wsw.dao.UserDao;
import com.wsw.factory.UserDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APPForInstanceUser {
    public static void main(String[] args) {
        // 创建实例工厂对象
        UserDaoFactory userDaoFactory = new UserDaoFactory();
        // 通过实例工厂对象创建对象
        UserDao userDao = userDaoFactory.getUserDao();
        userDao.save();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = context.getBean(UserDao.class);
        userDao1.save();

        UserDao userDao2 = (UserDao) context.getBean("userDao2");
        userDao2.save();
    }
}
