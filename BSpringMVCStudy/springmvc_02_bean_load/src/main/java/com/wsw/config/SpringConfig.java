package com.wsw.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @author loriyuhv
 * @date 2025/8/21
 * @description
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
@Import({JDBCConfig.class, MyBatisConfig.class})
// 方式一：设定扫描范围为精准范围
// @ComponentScan({"com.wsw.dao", "com.wsw.service"})
// 方式二：设定扫描范围为com.wsw,排除掉controller包中的bean
@ComponentScan(
        value = "com.wsw",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                value = Controller.class
        )
)
public class SpringConfig {
}
