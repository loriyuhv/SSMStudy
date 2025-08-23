package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author loriyuhv
 * @date 2025/8/23
 * @description
 */
@Configuration
// 方式一:修改Spring配置类，设定扫描范围为精准范围
// @ComponentScan({"com.wsw.dao", "com.wsw.service"})
// 方式二:修改Spring配置类，设定扫描范围为com.wsw,排除掉controller包中的bean
@ComponentScan(value = "com.wsw",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = Controller.class
        ))
public class SpringConfig {
}
