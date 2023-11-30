package com.wsw;

import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
        // 加载容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 注册钩子
        // context.registerShutdownHook();
        // 通过容器获取bean
        // BookDao bean = context.getBean("bookDao", BookDao.class);
        // bean.save();
        BookService bean = context.getBean(BookService.class);
        bean.save();
        context.close();
    }
}
