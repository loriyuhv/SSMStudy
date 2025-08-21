package com.wsw.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @author loriyuhv
 * @date 2025/8/21
 * @description Servlet容器配置类，替换web.xml
 */
// 4. 定义一个servlet容器启动的配置类，在里面加载spring的配置
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    // 加载SpringMVC容器配置
    // WebApplicationContext是SpringMVC最终体现的对象，也就是说SpringMVC容器最终体现的对象是WebApplicationContext
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        // 初始化WebApplicationContext对象
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        // 加载指定配置类
        context.register(SpringMvcConfig.class);
        return context;
    }

    // 设置由SpringMVC控制器处理的请求映射路径
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    // 加载Spring配置类
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
