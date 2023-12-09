package com.wsw.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wsw.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao extends BaseMapper<User> {
    
    @Select("select * from user where id = #{id};")
    User getById(Integer id);
}
