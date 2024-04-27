package com.wsw.service.impl;

import com.wsw.dao.StudentDao;
import com.wsw.mapper.StudentMapper;
import com.wsw.pojo.Student;
import com.wsw.service.StudentService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author loriyuhv
 * @ClassName StudentServiceImpl
 * @date 2024/4/26 23:03
 * @description student业务层接口实现类
 */

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student selectById(Integer id) {
        return studentDao.selectById(id);
    }

    @Override
    public Integer add(Student student) {
        Integer count = studentDao.add(student);
        if (count > 0) {
            System.out.println("student信息插入成功！！！");
        } else {
            System.out.println("student信息插入失败！！！");
        }
        return count;
    }
}
