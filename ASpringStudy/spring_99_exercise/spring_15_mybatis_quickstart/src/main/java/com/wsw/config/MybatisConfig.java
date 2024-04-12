package com.wsw.config;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author loriyuhv
 * @ClassName MybatisConfig
 * @date 2024/4/12 16:45
 * @description TODO
 */

public class MybatisConfig {
    // 定义bean，SqlSessionFactoryBean，用于产生SqlSessionFactory对象
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        System.out.println("SqlSessionFactoryBean running!!!");
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        // 设置模型类的别名扫描
        sqlSessionFactoryBean.setTypeAliasesPackage("com.wsw.domain");
        // 设置数据源
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    // 定义bean，返回MapperScannerConfigure对象
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.wsw.dao");
        return mapperScannerConfigurer;
    }
}
