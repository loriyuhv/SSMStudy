package com.wsw.factory;

import com.wsw.dao.OrderDao;
import com.wsw.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    // 静态工厂创建对象
    public static OrderDao getOrderDao() {
        return new OrderDaoImpl();
    }
}
