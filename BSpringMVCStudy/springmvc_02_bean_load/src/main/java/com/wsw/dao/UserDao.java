package com.wsw.dao;

import com.wsw.domain.User;
import org.apache.ibatis.annotations.Insert;

/**
 * @author loriyuhv
 * @date 2025/8/21
 * @description
 */
public interface UserDao {
    @Insert("INSERT INTO tb_user (id, name, age) VALUES (#{id}, #{name}, #{age});")
    void save(User user);
}
