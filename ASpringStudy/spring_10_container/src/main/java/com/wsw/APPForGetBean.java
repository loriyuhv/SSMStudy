package com.wsw;

import com.wsw.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APPForGetBean {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Bean的获取三种方式
        // 方式一
        BookDao bean = (BookDao) context.getBean("bookDao");
        bean.save();

        // 方式二
        BookDao bean1 = context.getBean("bookDao", BookDao.class);
        bean1.save();

        // 方式三
        BookDao bean2 = context.getBean(BookDao.class);
        bean2.save();
    }
}
