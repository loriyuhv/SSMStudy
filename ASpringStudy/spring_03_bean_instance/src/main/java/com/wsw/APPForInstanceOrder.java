package com.wsw;

import com.wsw.dao.OrderDao;
import com.wsw.factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APPForInstanceOrder {
    public static void main(String[] args) {
        // 传统方式通过静态工厂创建对象
        OrderDao orderDao1 = OrderDaoFactory.getOrderDao();
        orderDao1.save();

        // Spring通过静态工厂创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao2 = context.getBean(OrderDao.class);
        orderDao2.save();
    }
}
