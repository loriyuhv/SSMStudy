package com.wsw.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @author loriyuhv
 * @ClassName ServletContainersInitConfig
 * @date 2024/4/9 8:01
 * @description
 * servlet容器启动的配置，从而在里面加载spring的配置
 */

// 4. 定义一个servlet容器启动的配置类，在里面加载spring的配置

public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {

    // 加载SpringMVC容器配置
    // WebApplicationContext是SpringMVC最终体现的对象，也就是说SpringMVC容器最终体现的对象是WebApplicationContext
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        // 初始化了一个空的容器对象
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        // 加载具体的配置信息
        ctx.register(SpringMvcConfig.class);
        System.out.println("Hello");
        return ctx;
    }

    // 设置哪些请求归属SpringMVC处理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    // 加载Spring容器配置
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
