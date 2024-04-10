package com.wsw.factory;

import com.wsw.dao.OrderDao;
import com.wsw.dao.impl.OrderDaoImpl;

/**
 * @author loriyuhv
 * @ClassName OrderFactory
 * @date 2024/4/10 15:43
 * @description TODO
 */

public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        return new OrderDaoImpl();
    }
}
