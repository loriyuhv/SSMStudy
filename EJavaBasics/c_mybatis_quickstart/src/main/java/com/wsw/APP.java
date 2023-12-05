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

public class APP {
    public static void main(String[] args) throws IOException {
        // 1. 加载mybatis的核心配置文件，获取SqlSessionFactory对象（不用记）
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 3. 执行sql
        // List<User> users = sqlSession.selectList("test.selectAll");
        // 3.1 获取UserMapper接口的代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAll();
        System.out.println(users);
        // 4. 释放资源
        sqlSession.close();
    }
}
