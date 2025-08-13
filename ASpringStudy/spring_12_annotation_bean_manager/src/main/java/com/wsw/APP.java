package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class APP {
    public static void main(String[] args) {
        // 测试bean的作用范围
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao1 = context.getBean(BookDao.class);
        BookDao bookDao2 = context.getBean(BookDao.class);
        System.out.println(bookDao1);
        System.out.println(bookDao2);
        System.out.println("========================================");
        // 测试bean的声明周期
        ConfigurableApplicationContext context2 = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = context2.getBean(BookDao.class);
        bookDao.save();
        context2.close();
    }
}
