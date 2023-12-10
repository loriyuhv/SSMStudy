package com.wsw.mapper;

import com.wsw.model.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 23859
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2023-12-09 14:03:03
* @Entity com.wsw.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




