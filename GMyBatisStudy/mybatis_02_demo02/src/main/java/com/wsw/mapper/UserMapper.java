package com.wsw.mapper;

import com.wsw.pojo.User;

import java.util.List;

/**
 * @author loriyuhv
 * @ClassName UserMapper
 * @date 2024/4/12 15:28
 * @description TODO
 */

public interface UserMapper {
    List<User> selectAll();
}
