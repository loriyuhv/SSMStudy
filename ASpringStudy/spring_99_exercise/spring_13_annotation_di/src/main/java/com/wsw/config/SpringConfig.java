package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author loriyuhv
 * @ClassName SpringConfig
 * @date 2024/4/11 9:01
 * @description TODO
 */
@Configuration
@ComponentScan("com.wsw")
@PropertySource(value = {"jdbc.properties"}, ignoreResourceNotFound = true)
public class SpringConfig {
}
