package com.wsw.service;

import com.wsw.pojo.Student;

/**
 * @author loriyuhv
 * @ClassName StudentService
 * @date 2024/4/26 23:02
 * @description student业务层接口
 */

public interface StudentService {
    Student selectById(Integer id);

    Integer add(Student student);
}
