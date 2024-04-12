package com.wsw;

import com.wsw.mapper.UserMapper;
import com.wsw.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author loriyuhv
 * @ClassName MyBatisDemo
 * @date 2024/4/12 5:51
 * @description MyBatis快速入门
 */

public class MyBatisDemo {
    public static void main(String[] args) throws IOException {
        // 1. 加载Mybatis的核心配置文件，获取SqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. 执行sql
        // List<User> users = sqlSession.selectList("test.selectAll");
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAll();
        for (User user :
                users) {
            System.out.println(user);
        }
    }
}
