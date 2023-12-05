package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class APP {
    public static void main(String[] args) throws ClassNotFoundException {
        ApplicationContext context = new AnnotationConfigApplicationContext(Class.forName("com.wsw.config.SpringConfig"));
        // BookService bean = context.getBean(BookService.class);
        // bean.save();

        BookDao bean = (BookDao) context.getBean("bookDao2");
        bean.save();
    }
}
