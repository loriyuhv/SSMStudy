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
 * @date 2025/8/21
 * @description
 */
@WebServlet("/user/save")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 接受请求参数
        String name = req.getParameter("name");
        System.out.println("servlet save name ===> " + name);
        // 2. 产生响应
        resp.setContentType("text/json;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.write("{'module': 'servlet save'}");
    }
}
