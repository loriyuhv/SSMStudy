package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author loriyuhv
 * @date 2025/8/21
 * @description
 */
@Configuration
@ComponentScan({"com.wsw.dao", "com.wsw.service"})
public class SpringConfig {
}
