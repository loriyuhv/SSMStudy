package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import org.springframework.stereotype.Component;

// 步骤2:Dao上添加注解  在BookDaoImpl类上添加@Component注解
// Component注解 相当于 <bean/>
// 注解参数"bookDao" 相当于 id
// 注解写在哪个类上 相当于 class(参数是该类的全类名)
@Component("bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
