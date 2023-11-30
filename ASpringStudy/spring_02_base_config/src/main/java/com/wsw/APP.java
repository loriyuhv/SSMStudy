package com.wsw;

import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {
    public static void main(String[] args) {
        // 3. 获取IoC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 4. 从容器中获取对象进行方法调用
        BookDao bean = (BookDao) context.getBean("dao");
        bean.save();

        BookService book1 = context.getBean(BookService.class);
        BookService book2 = context.getBean(BookService.class);
        System.out.println(book1);
        System.out.println(book2);
    }
}
