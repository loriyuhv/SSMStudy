package com.wsw;

import com.wsw.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @date 2025/8/12
 * @description 测试bean
 */
public class APPForScope {
    public static void main(String[] args) {
        // 3. 获取容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 4. 从IoC容器中获取BookService对象
        BookService bookService1 = (BookService) context.getBean("bookService");
        BookService bookService2 = (BookService) context.getBean("bookService");
        System.out.println(bookService1);
        System.out.println(bookService2);
    }
}
