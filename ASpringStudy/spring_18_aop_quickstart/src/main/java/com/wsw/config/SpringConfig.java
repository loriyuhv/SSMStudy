package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author loriyuhv
 * @date 2025/8/13
 * @description spring配置类
 */
@Configuration
@ComponentScan("com.wsw")
// 步骤七：开启Spring对AOP注解驱动支持
@EnableAspectJAutoProxy
public class SpringConfig {

}
