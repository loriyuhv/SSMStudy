package com.wsw;

import com.wsw.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class APP {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource1 = (DataSource) context.getBean("dataSource");
        System.out.println(dataSource1);
        DataSource dataSource2 = (DataSource) context.getBean("dataSource2");
        System.out.println(dataSource2);

        BookDao bean = context.getBean(BookDao.class);
        bean.save();
    }
}
