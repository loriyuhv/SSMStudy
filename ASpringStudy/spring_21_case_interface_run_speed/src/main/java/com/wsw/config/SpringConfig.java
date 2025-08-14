package com.wsw.config;

import org.springframework.context.annotation.*;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description spring配置类
 */
@Configuration
@ComponentScan("com.wsw")
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Import({JdbcConfig.class,MyBatisConfig.class})
public class SpringConfig {

}
