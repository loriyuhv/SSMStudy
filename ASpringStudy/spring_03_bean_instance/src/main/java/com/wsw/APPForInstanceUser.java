package com.wsw;

import com.wsw.dao.UserDao;
import com.wsw.factory.UserDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APPForInstanceUser {
    public static void main(String[] args) {
        // 方式三、使用实例工厂创建bean对象
        // 1）创建实例工厂对象
        UserDaoFactory userDaoFactory = new UserDaoFactory();
        // 2）通过实例工厂对象创建对象
        UserDao userDao = userDaoFactory.getUserDao();
        userDao.save();


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 方式三、Spring使用实例工厂实例化bean测试
        UserDao userDao1 = (UserDao) context.getBean("userDao1");
        userDao1.save();
        System.out.println(userDao1);
        // 方式四、spring改良实例工厂实例化bean的方式测试
        UserDao userDao2 = (UserDao) context.getBean("userDao2");
        userDao2.save();
        System.out.println(userDao2);
    }
}
