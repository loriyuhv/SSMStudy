package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author loriyuhv
 * @ClassName SpringConfig
 * @date 2024/4/9 20:02
 * @description TODO
 */

@Configuration
//@ComponentScan({"com.wsw.dao", "com.wsw.service"})
@ComponentScan(value="com.wsw",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,   // 按注解过滤
                classes = Controller.class
        )
)
public class SpringConfig {
}
