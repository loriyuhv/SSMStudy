package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author loriyuhv
 * @date 2025/8/13
 * @description spring配置类
 */
@Configuration
@ComponentScan("com.wsw")
@Import({JdbcConfig.class, MyBatisConfig.class})
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {
}
