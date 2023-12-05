package com.wsw;

import com.wsw.dao.impl.BookDaoImpl;
import com.wsw.service.BookService;
import com.wsw.service.impl.BookServiceImpl;

import java.lang.reflect.Field;

/**
 * 为什么setter方法可以删除呢?
 * - 自动装配基于反射设计创建对象并通过暴力反射为私有属性进行设值
 * - 普通反射只能获取public修饰的内容
 * - 暴力反射除了获取public修饰的内容还可以获取private修改的内容
 * - 所以此处无需提供setter方法
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = Class.forName("com.wsw.service.impl.BookServiceImpl");
        Field bookDao = clazz.getDeclaredField("bookDao");
        BookService bookService = new BookServiceImpl();
        // 创建对象并通过暴力反射为私有属性进行设值
        bookDao.setAccessible(true);
        bookDao.set(bookService, new BookDaoImpl());
        bookService.save();
    }
}
