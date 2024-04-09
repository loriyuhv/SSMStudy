package com.wsw.dao;

import com.wsw.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * @author loriyuhv
 * @ClassName UserDao
 * @date 2024/4/9 19:51
 * @description TODO
 */

public interface UserDao {
    @Insert("insert into tb_user(name, age) values(#{name}, #{age})")
    void save(User user);
}
