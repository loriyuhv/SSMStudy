package com.wsw.factory;

import com.wsw.dao.UserDao;
import com.wsw.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author loriyuhv
 * @ClassName UserDaoFactoryBean
 * @date 2024/4/10 16:01
 * @description TODO
 */

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    // 代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    @Override
    public boolean isSingleton() {
        return true; // 单例 singleton  非单例：prototype
    }
}
