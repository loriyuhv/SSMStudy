package com.wsw.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author loriyuhv
 * @date 2025/8/15
 * @description 用户存储Servlet类
 */
@WebServlet("/user/save")
public class UserSaveServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 接收请求参数
        String name = req.getParameter("name");
        System.out.println("servlet save name ===> " + name);
        // 2. 产生响应
        resp.setContentType("text/json;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.write("{'module':'servlet save'}");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
