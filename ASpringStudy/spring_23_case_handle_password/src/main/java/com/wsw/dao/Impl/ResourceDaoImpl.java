package com.wsw.dao.Impl;

import com.wsw.dao.ResourceDao;
import org.springframework.stereotype.Repository;

/**
 * @author loriyuhv
 * @date 2025/8/14
 * @description
 */
@Repository
public class ResourceDaoImpl implements ResourceDao {
    @Override
    public boolean openURL(String url, String password) {
        // 模拟校验
        return password.equals("root");
    }
}
