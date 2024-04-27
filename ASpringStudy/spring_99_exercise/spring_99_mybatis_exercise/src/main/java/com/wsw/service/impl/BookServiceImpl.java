package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.pojo.Book;
import com.wsw.service.BookService;
import org.springframework.stereotype.Service;

/**
 * @author loriyuhv
 * @ClassName BookServiceImpl
 * @date 2024/4/27 0:40
 * @description TODO
 */

@Service
public class BookServiceImpl implements BookService {
    private final BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public Integer add(Book book) {
        Integer count = bookDao.add(book);
        if (count > 0) {
            System.out.println("book信息添加成功");
        } else {
            System.out.println("book信息添加失败");
        }
        return count;
    }
}
