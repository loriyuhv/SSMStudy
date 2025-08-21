package com.wsw.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author loriyuhv
 * @date 2025/8/22
 * @description
 */
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /*
     * @description 出现乱码的原因相信大家都清楚，Tomcat8.5以后的版本已经
     * 处理了中文乱码的问题，但是IDEA中的Tomcat插件目前只到Tomcat7，所以
     * 需要修改pom.xml来解决GET请求中文乱码问题。
     */
    // @Override
    // protected Filter[] getServletFilters() {
    //     CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
    //     characterEncodingFilter.setEncoding("UTF-8");
    //     return new Filter[]{characterEncodingFilter};
    // }
}
