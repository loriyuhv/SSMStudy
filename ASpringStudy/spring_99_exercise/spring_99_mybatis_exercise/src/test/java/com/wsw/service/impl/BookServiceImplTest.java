package com.wsw.service.impl;

import com.wsw.config.SpringConfig;
import com.wsw.pojo.Book;
import com.wsw.service.BookService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 设置类运行器
@RunWith(SpringJUnit4ClassRunner.class)
// 设置Spring环境对应的配置类
@ContextConfiguration(classes = {SpringConfig.class}) // 加载配置类
public class BookServiceImplTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testAdd() {
        // 接收信息
        Book book = new Book();
        book.setBookName("杀死一只知更鸟");
        book.setBookPrice(29.88);
        Integer add = bookService.add(book);
        System.out.println(add);
    }

}