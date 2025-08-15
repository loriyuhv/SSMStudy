package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author loriyuhv
 * @ClassName SpringMvcConfig
 * @date 2024/4/9 7:59
 * @description springmvc配置文件，加载controller对应的bean
 */

// 3. 创建springmvc的配置文件，加载controller对应的bean
@Configuration
@ComponentScan("com.wsw.controller")
// @Import(ServletContainersInitConfig.class)
public class SpringMvcConfig {
}
