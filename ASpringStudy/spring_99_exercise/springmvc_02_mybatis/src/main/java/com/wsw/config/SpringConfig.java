package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author loriyuhv
 * @ClassName SpringConfig
 * @date 2024/4/26 23:00
 * @description Spring配置类
 */

@Configuration
@ComponentScan({"com.wsw.dao", "com.wsw.service", "com.wsw.mapper"})
@Import({JDBCConfig.class, MyBatisConfig.class})
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {
}
