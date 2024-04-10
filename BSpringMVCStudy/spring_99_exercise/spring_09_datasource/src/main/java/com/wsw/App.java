package com.wsw;

import com.wsw.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.Map;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/10 19:15
 * @description TODO
 */

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        // DataSource dataSource = (DataSource) context.getBean("dataSource");
        // DataSource dataSource2 = (DataSource) context.getBean("dataSource2");
        // System.out.println(dataSource);
        // System.out.println(dataSource2);

        UserDao bean = context.getBean(UserDao.class);
        bean.save();

        // 查看系统的环境变量
        // Map<String, String> env = System.getenv();
        // System.out.println(env);
        // System.out.println(env.get("USERNAME"));
    }
}
