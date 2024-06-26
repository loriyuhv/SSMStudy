package com.wsw.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @author loriyuhv
 * @ClassName ServletContainersInitConfig
 * @date 2024/4/9 21:45
 * @description TODO
 */

public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMVCConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //乱码处理
    // @Override
    // protected Filter[] getServletFilters() {
    //     CharacterEncodingFilter filter = new CharacterEncodingFilter();
    //     filter.setEncoding("UTF-8");
    //     return new Filter[]{filter};
    //
    // }
    /**
     * @description 乱码处理
     */
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }
}
