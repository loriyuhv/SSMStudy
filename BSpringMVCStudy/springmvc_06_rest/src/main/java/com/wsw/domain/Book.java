package com.wsw.domain;

/**
 * @author loriyuhv
 * @date 2025/8/21
 * @description
 */
public class Book {
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
