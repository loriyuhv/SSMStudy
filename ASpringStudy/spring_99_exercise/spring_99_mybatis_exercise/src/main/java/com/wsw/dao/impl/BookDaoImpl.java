package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import com.wsw.mapper.BookMapper;
import com.wsw.pojo.Book;
import org.springframework.stereotype.Repository;

/**
 * @author loriyuhv
 * @ClassName BookDaoImpl
 * @date 2024/4/27 0:35
 * @description TODO
 */

@Repository
public class BookDaoImpl implements BookDao {
    private final BookMapper bookMapper;

    public BookDaoImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public Integer add(Book book) {
        return bookMapper.add(book);
    }
}
