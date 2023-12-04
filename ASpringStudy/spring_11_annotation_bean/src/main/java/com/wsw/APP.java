package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {
    public static void main(String[] args) {
        // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml.bak");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bean = context.getBean(BookDao.class);
        bean.save();
        BookService bean1 = context.getBean(BookService.class);
        bean1.save();
    }
}
