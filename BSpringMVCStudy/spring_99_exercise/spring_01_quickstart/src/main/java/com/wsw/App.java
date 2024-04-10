package com.wsw;

import com.wsw.service.BookService;
import com.wsw.service.impl.BookServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/10 9:50
 * @description TODO
 */

public class App {
    public static void main(String[] args) {
        // 获取IOC容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器中获取对象进行方法调用
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.save();
    }
}
