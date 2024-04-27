package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.mapper.StudentMapper;
import com.wsw.pojo.Student;
import junit.framework.TestCase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author loriyuhv
 * @ClassName StudentMapperTest
 * @date 2024/4/26 22:53
 * @description StudentMapper代理对象测试
 */

public class StudentMapperTest extends TestCase {

    public void testSelectById() throws IOException {
        // 1. SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 2. SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 3. mapper
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        // 4. 执行sql方法
        Student student = studentMapper.selectById(1);
        System.out.println(student);
        // 5. 释放资源
        sqlSession.close();
    }

    public void testDruid() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource bean = ctx.getBean(DataSource.class);
        System.out.println(bean);
    }

    public void testMybatis() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 1. 获取SqlSession
        StudentMapper bean = ctx.getBean(StudentMapper.class);
        Student student = bean.selectById(1);
        System.out.println(student);
    }
}
