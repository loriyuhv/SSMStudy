package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.service.ResourceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourceService bean = context.getBean(ResourceService.class);
        boolean b = bean.openURL("https://www.baidu.com", " root ");
        System.out.println(b);
    }
}
