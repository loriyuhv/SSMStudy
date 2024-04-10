package com.wsw.factory;

import com.wsw.dao.OrderDao;
import com.wsw.dao.impl.OrderDaoImpl;

/**
 * @author loriyuhv
 * @ClassName OrderDaoFactory
 * @date 2024/4/10 11:14
 * @description TODO
 */

public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        System.out.println("factory setup ...");
        return new OrderDaoImpl();
    }
}
