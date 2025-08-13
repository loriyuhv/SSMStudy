package com.wsw;

import com.wsw.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class APPForCreateContainer {
    public static void main(String[] args) {
        // 容器的创建方式
        // 1.类路径下的XML配置文件
        // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2.文件系统下的XML配置文件
        ApplicationContext context = new FileSystemXmlApplicationContext("F:\\Repositories\\SSMStudy\\ASpringStudy\\spring_10_container\\src\\main\\resources\\applicationContext.xml");
        BookDao bean = context.getBean(BookDao.class);
        bean.save();
    }
}
