package com.wsw;

import com.wsw.dao.OrderDao;
import com.wsw.dao.impl.OrderDaoImpl;
import com.wsw.factory.OrderDaoFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/10 15:41
 * @description TODO
 */

public class App {
    public static void main(String[] args) {
        // OrderDao orderDao = new OrderDaoImpl();
        // orderDao.save();

        // OrderDao orderDao = OrderDaoFactory.getOrderDao();
        // orderDao.save();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao) context.getBean("orderDao");
        orderDao.save();

    }
}
