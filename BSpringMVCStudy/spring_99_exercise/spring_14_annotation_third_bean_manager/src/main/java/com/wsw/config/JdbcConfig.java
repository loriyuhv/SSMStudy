package com.wsw.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author loriyuhv
 * @ClassName JdbcConfig
 * @date 2024/4/11 9:49
 * @description TODO
 */

// @Configuration
public class JdbcConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }

    // @Bean
    // public DataSource dataSource() {
    //     DruidDataSource ds = new DruidDataSource();
    //     ds.setDriverClassName("com.mysql.jdbc.Driver");
    //     ds.setUrl("jdbc:mysql://localhost:3306/spring_tb");
    //     ds.setUsername("root");
    //     ds.setPassword("0420");
    //     return ds;
    // }
}
