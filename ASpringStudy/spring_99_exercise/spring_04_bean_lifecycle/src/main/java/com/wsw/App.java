package com.wsw;

import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/10 16:10
 * @description TODO
 */

public class App {
    public static void main(String[] args) {
        // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();
        // 问题：destroy操作无效，因为程序结束之后，Java虚拟机直接关闭
        // 方式一：虚拟机退出之前，我把容器关闭了
        // context.close();    // 关闭容器方法 ApplicationContext接口没有提供此方法
        // ConfigurableApplicationContext提供了
        // ClassPathXmlApplicationContext也提供了
        // 方式二：关闭钩子
        context.registerShutdownHook(); // 表示虚拟机关闭之前，先把容器关闭
    }
}
