package com.wsw;

import com.wsw.dao.OrderDao;
import com.wsw.factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APPForInstanceOrder {
    public static void main(String[] args) {
        // 通过静态工厂创建对象
        // OrderDao orderDao = OrderDaoFactory.getOrderDao();
        // orderDao.save();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = context.getBean(OrderDao.class);
        orderDao.save();
    }
}
