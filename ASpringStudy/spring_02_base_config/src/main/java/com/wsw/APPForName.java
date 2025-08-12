package com.wsw;

import com.wsw.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @date 2025/8/12
 * @description 测试bean的name属性
 */
public class APPForName {
    public static void main(String[] args) {
        // 3. 获取IoC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 4. 从容器中获取对象进行方法调用
        BookDao bean = (BookDao) context.getBean("dao");
        bean.save();
    }
}
