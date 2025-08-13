package com.wsw.domain;

import lombok.Data;

/**
 * @author loriyuhv
 * @date 2025/8/13
 * @description account表映射实体类
 */
@Data
public class Account {
    private Integer id;
    private String name;
    private Double money;
}
