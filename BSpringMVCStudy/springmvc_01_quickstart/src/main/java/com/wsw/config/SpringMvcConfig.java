package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author loriyuhv
 * @date 2025/8/21
 * @description Spring MVC配置类，加载controller对应的bean
 */
// 3. 创建springmvc的配置文件，加载controller对应的bean
@Configuration
@ComponentScan("com.wsw.controller")
public class SpringMvcConfig {

}
