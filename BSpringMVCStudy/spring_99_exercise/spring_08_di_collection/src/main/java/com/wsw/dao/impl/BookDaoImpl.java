package com.wsw.dao.impl;

import com.wsw.dao.BookDao;

import java.util.*;

/**
 * @author loriyuhv
 * @ClassName BookDaoImpl
 * @date 2024/4/10 18:07
 * @description TODO
 */

public class BookDaoImpl implements BookDao {
    private int[] array;
    private List<String> list;
    private Set<String> set;

    private Map<String, String> map;
    private Properties properties;

    @Override
    public void save() {
        System.out.println("book dao save ...");
        System.out.println("遍历数组：" + Arrays.toString(array));
        System.out.println("遍历列表：" + list);
        System.out.println("遍历集合：" + set);
        System.out.println("遍历Map：" + map);
        System.out.println("遍历Properties：" + properties);
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
