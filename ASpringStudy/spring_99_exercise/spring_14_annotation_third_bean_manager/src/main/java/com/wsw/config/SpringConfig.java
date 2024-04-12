package com.wsw.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @author loriyuhv
 * @ClassName SpringConfig
 * @date 2024/4/11 9:44
 * @description TODO
 */

@Configuration
@ComponentScan("com.wsw")
@Import({JdbcConfig.class})
@PropertySource(value = {"classpath:jdbc.properties"})
public class SpringConfig {


}
