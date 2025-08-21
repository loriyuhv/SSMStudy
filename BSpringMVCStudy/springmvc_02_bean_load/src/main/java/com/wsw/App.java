package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author loriyuhv
 * @date 2025/8/22
 * @description 测试Spring配置类是否排除了controller包
 * 注意：测试时，需要注释SpringMvcConfig的@Configuration注解
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = context.getBean(UserController.class);
        System.out.println(userController); // 报错
    }
}
