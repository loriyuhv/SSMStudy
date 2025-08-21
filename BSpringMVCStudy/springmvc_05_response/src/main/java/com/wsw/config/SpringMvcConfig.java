package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author loriyuhv
 * @date 2025/8/21
 * @description
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.wsw.controller")
public class SpringMvcConfig {
}
