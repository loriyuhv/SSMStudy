package com.wsw.mapper;

import com.wsw.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author loriyuhv
 * @ClassName StudentMapper
 * @date 2024/4/26 22:42
 * @description student表信息操作 mapper代理对象
 */

public interface StudentMapper {
    Student selectById(@Param("id") Integer id);

    @Insert("insert into student (stu_name, stu_age) values (#{stuName}, #{stuAge});")
    Integer add(Student student);
}
