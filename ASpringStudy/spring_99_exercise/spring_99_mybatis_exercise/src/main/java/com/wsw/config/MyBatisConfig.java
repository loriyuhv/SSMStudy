package com.wsw.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author loriyuhv
 * @ClassName MyBatisConfig
 * @date 2024/4/26 23:59
 * @description Mybatis配置类
 */

public class MyBatisConfig {
    // 定义bean SqlSessionFactoryBean，用于生产SqlSessionFactory对象
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        // 设置模型类的别名扫描
        sqlSessionFactoryBean.setTypeAliasesPackage("com.wsw.pojo");
        // 设置数据源
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    // 定义bean，返回MapperScannerConfigurer对象
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.wsw.mapper");
        return mapperScannerConfigurer;
    }
}
