package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description spring配置类
 */
@Configuration
@ComponentScan("com.wsw")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
