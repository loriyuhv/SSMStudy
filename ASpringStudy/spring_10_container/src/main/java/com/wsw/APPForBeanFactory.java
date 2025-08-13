package com.wsw;

import com.wsw.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APPForBeanFactory {
    public static void main(String[] args) {
        // Resource resource = new ClassPathResource("applicationContext.xml");
        // BeanFactory beanFactory = new XmlBeanFactory(resource);
        // BookDao bean = beanFactory.getBean(BookDao.class);
        // bean.save();

        // ApplicationContext ==> ListableBeanFactory ==> BeanFactory(顶层接口)
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bean = context.getBean(BookDao.class);
        bean.save();
    }
}
