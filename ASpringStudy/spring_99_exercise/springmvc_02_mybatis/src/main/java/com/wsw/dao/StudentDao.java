package com.wsw.dao;

import com.wsw.pojo.Student;

/**
 * @author loriyuhv
 * @ClassName StudentDao
 * @date 2024/4/26 23:23
 * @description 操作student数据表持久层
 */

public interface StudentDao {
    Student selectById(Integer id);

    Integer add(Student student);
}
