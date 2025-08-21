package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author loriyuhv
 * @date 2025/8/21
 * @description
 */
@EnableWebMvc
@Configuration
@ComponentScan({"com.wsw.controller","com.wsw.config"})
public class SpringMvcConfig {
}
