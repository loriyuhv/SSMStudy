package com.wsw.cGetField;

import java.lang.reflect.Field;
import java.util.Arrays;

public class GetField {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = Class.forName("com.wsw.cGetField.Student");

        // 获取公共类型成员变量
        // Field[] fields = clazz.getFields();
        // System.out.println(Arrays.toString(fields));

        // 获取所有类型成员变量
        // Field[] declaredFields = clazz.getDeclaredFields();
        // for (Field declaredField : declaredFields) {
        //     System.out.println(declaredField);
        // }

        // 获取单个公共成员变量
        // Field school = clazz.getField("school");
        // System.out.println(school);

        // 获取单个成员变量
        // Field age = clazz.getDeclaredField("age");
        // System.out.println(age);

        Field name = clazz.getDeclaredField("name");
        System.out.println(name);
        //获取权限修饰符
        int modifiers = name.getModifiers();
        System.out.println(modifiers);

        // 获取成员变量名
        String name1 = name.getName();
        System.out.println(name1);

        // 获取数据类型
        Class<?> type = name.getType();
        System.out.println(type);

        // 获取成员变量记录的值，跟对象有关系
        Student student = new Student("Jerry", "male", 18);
        name.setAccessible(true);
        String student_name = (String) name.get(student);
        System.out.println(student_name);

        // 更改成员变量的值
        name.set(student, "Tom");
        System.out.println(student.getName());

    }
}
