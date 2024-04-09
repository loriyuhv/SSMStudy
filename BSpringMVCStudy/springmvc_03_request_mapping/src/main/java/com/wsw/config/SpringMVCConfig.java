package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author loriyuhv
 * @ClassName SpringMVCConfig
 * @date 2024/4/9 21:45
 * @description TODO
 */

@Configuration
@ComponentScan("com.wsw.controller")
@EnableWebMvc   // 开启json数据类型自动转换
public class SpringMVCConfig {
}
