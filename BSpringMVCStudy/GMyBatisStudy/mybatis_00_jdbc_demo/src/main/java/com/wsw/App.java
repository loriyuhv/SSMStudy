package com.wsw;

import com.wsw.domain.User;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/12 11:21
 * @description TODO
 */

public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 数据源
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mybatis?useSSL=false";
        String name = "root";
        String pwd = "0420";

        // 1. 加载驱动
        Class.forName(driver);
        // 2. 创建连接
        Connection connection = DriverManager.getConnection(url, name, pwd);


        String gender = "男";
        // 定义sql
        String sql = "select * from tb_user where gender = ?";
        // 获取PrepareStatement对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        // 设置？的值
        preparedStatement.setString(1, gender);

        // 3. 执行sql
        ResultSet resultSet = preparedStatement.executeQuery();

        // 4. 遍历resultSet，获取数据
        User user = null;
        ArrayList<User> users = new ArrayList<>();
        while(resultSet.next()) {
            // 获取数据
            int id = resultSet.getInt("id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            gender = resultSet.getString("gender");
            String addr = resultSet.getString("addr");

            // 创建对象，设置属性值
            user = new User();
            user.setId(id);
            user.setUsername(username);
            user.setPassword(password);
            user.setGender(gender);
            user.setAddr(addr);

            // 插入集合
            users.add(user);
        }

        System.out.println(users);
    }
}
