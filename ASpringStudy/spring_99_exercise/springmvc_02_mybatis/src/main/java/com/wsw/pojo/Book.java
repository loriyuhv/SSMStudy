package com.wsw.pojo;

import lombok.Data;

/**
 * @author loriyuhv
 * @ClassName Book
 * @date 2024/4/27 0:30
 * @description 书籍
 */

@Data
public class Book {
    private Integer id;
    private String bookName;
    private Double bookPrice;
}
