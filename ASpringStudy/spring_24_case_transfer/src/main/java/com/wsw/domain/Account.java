package com.wsw.domain;

import lombok.Data;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description Account实体类映射spring_db数据库中tb_account表
 */
@Data
public class Account {
    private Integer id;
    private String name;
    private Double money;
}
