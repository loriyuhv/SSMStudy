package com.wsw;

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
 * @ClassName App
 * @date 2024/4/12 15:05
 * @description TODO
 */

public class App {
    public static void main(String[] args) throws IOException {
        // 1. 加载mybatis核心配置文件，获取SqlSessionFactory对象（不用记）
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sessionFactory.openSession();

        // 3. 执行sql语句
        List<User> users = sqlSession.selectList("test.selectAll");
        for (User user : users) {
            System.out.println(user);
        }

        // 4. 释放资源
        sqlSession.close();
    }
}
