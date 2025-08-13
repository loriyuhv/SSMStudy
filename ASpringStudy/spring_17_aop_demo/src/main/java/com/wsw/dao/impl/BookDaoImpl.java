package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author loriyuhv
 * @date 2025/8/13
 * @description BookDao实现类
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        // 记录程序当前执行时间（开始时间）
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println("bookDao save ...");
        }
        // 记录程序当前执行时间（结束时间）
        long endTime = System.currentTimeMillis();
        // 计算时间差
        long totalTime = endTime - startTime;
        // 输出信息
        System.out.println("执行万次消耗时间：" + totalTime + "ms");
    }

    public void update() {
        System.out.println("bookDao update ...");
    }

    public void delete() {
        System.out.println("bookDao delete ...");
    }

    public void select() {
        System.out.println("bookDao select ...");
    }
}
