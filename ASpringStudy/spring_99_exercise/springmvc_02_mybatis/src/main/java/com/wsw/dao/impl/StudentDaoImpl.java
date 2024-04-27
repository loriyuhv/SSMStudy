package com.wsw.dao.impl;

import com.wsw.dao.StudentDao;
import com.wsw.mapper.StudentMapper;
import com.wsw.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author loriyuhv
 * @ClassName StudentDaoImpl
 * @date 2024/4/26 23:24
 * @description StudentDao接口实现类
 */

@Repository
public class StudentDaoImpl implements StudentDao {
    @Override
    public Student selectById(Integer id) {
        // 1. SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        // 2. SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 3. mapper
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        // 4. 执行sql方法
        Student student = studentMapper.selectById(id);

        // 5. 释放资源
        sqlSession.close();

        // 6. 返回结果
        return student;
    }

    @Override
    public Integer add(Student student) {
        // 1. SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        // 2. SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 3. mapper
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        // 4. 执行sql方法
        Integer count = studentMapper.add(student);

        // 5. 释放资源
        sqlSession.close();

        return count;
    }
}
