package com.wsw;

import com.wsw.dao.AccountDao;
import com.wsw.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/11 10:48
 * @description TODO
 */

public class App {
    public static void main(String[] args) throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        Account account = mapper.findById(1);
        System.out.println(account);
        sqlSession.close();
    }
}
