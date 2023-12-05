package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class APP {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bean = context.getBean(BookDao.class);
        bean.save();

        DataSource bean1 = context.getBean(DataSource.class);
        System.out.println(bean1);
    }
}
