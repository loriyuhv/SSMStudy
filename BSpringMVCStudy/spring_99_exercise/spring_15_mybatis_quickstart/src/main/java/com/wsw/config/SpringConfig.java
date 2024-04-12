package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author loriyuhv
 * @ClassName SpringConfig
 * @date 2024/4/12 16:39
 * @description TODO
 */

@Configuration
@ComponentScan("com.wsw")
@PropertySource("classpath:jdbc.properties")
@Import({JDBCConfig.class, MybatisConfig.class})
public class SpringConfig {
}
