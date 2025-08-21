package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author loriyuhv
 * @date 2025/8/20
 * @description SpringMvc配置类
 */
// 接收json数据步骤二：使用@EnableWebMvc启用WebMvc
@EnableWebMvc
@Configuration
@ComponentScan("com.wsw.controller")
public class SpringMvcConfig {
}
