package com.wsw;

import com.wsw.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class APPForBeanFactory {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        // BookDao bean = beanFactory.getBean(BookDao.class);
        // bean.save();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bean = context.getBean(BookDao.class);
        bean.save();
    }
}
