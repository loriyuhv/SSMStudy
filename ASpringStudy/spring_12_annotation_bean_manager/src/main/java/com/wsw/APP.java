package com.wsw;

import com.sun.security.jgss.GSSUtil;
import com.wsw.config.SpringConfig;
import com.wsw.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class APP {
    public static void main(String[] args) {
        // ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // BookDao bean = context.getBean(BookDao.class);
        // bean.save();
        // BookDao bean1 = context.getBean(BookDao.class);
        // System.out.println(bean);
        // System.out.println(bean1);

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bean = context.getBean(BookDao.class);
        bean.save();
        context.close();
    }
}
