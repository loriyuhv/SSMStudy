package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author loriyuhv
 * @date 2025/8/17
 * @description Spring配置类
 */
@Configuration
@Import(JDBCConfig.class)
@PropertySource("classpath:jdbc.properties")
@ComponentScan({"com.wsw.service", "com.wsw.dao"})
public class SpringConfig {
}
