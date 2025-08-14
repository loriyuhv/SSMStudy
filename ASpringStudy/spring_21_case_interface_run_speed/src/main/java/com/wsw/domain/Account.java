package com.wsw.domain;

import lombok.Data;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description tb_account对应的实体类
 */
@Data
public class Account {
    private Integer id;
    private String name;
    private Double money;
}
