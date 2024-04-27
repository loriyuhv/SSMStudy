package com.wsw.pojo;

import lombok.Data;

/**
 * @author loriyuhv
 * @ClassName Student
 * @date 2024/4/26 22:49
 * @description 学生信息实体类
 */

@Data
public class Student {
    private Integer id;
    private String stuName;
    private Integer stuAge;
}
