package com.wsw.domain;

/**
 * @author loriyuhv
 * @date 2025/8/21
 * @description
 */
public class User {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
