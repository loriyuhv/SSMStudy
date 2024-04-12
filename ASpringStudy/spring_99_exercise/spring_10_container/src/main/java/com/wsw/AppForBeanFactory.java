package com.wsw;

import com.wsw.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.lang.annotation.Annotation;

/**
 * @author loriyuhv
 * @ClassName AppForBeanFactory
 * @date 2024/4/10 20:36
 * @description TODO
 */

public class AppForBeanFactory {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("application.xml");
        BeanFactory bf = new XmlBeanFactory(resource);
        // BookDao bookDao = bf.getBean(BookDao.class);
        // bookDao.save();
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        // context.getBean("application.xml");
    }
}
