package com.wsw.mapper;

import com.wsw.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author loriyuhv
 * @ClassName BookMapper
 * @date 2024/4/27 0:32
 * @description book mapper对象接口
 */

@Mapper
public interface BookMapper {
    Integer add(Book book);
}
