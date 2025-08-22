package com.wsw.domain;

import lombok.Data;

/**
 * @author loriyuhv
 * @date 2025/8/21
 * @description 图书POJO
 */
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
