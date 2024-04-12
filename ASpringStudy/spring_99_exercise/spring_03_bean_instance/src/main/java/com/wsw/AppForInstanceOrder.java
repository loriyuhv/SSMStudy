package com.wsw;

import com.wsw.dao.OrderDao;
import com.wsw.factory.OrderDaoFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @ClassName AppForInstanceOrder
 * @date 2024/4/10 11:16
 * @description TODO
 */

public class AppForInstanceOrder {
    public static void main(String[] args) {
        // 通过静态工厂创建对象
        // OrderDao orderDao = OrderDaoFactory.getOrderDao();
        // orderDao.save();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao) context.getBean("orderDao");
        orderDao.save();
    }
}
