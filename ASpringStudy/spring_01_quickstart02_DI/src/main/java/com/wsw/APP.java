package com.wsw;

import com.wsw.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {
    public static void main(String[] args) {
        // 3. 获取IoC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 4. 从容器中获取对象进行方法调用
        BookService bean = context.getBean(BookService.class);
        bean.save();
    }
}
