package com.wsw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author loriyuhv
 * @date 2025/8/21
 * @description SpringMVC  Controller控制类
 */
// 2. 定义controller
// 2.1 使用controller定义bean
@Controller
public class UserController {
    // 2.3 设置当前操作的返回值类型
    @ResponseBody
    // 2.2 设置当前操作的请求路径
    @RequestMapping("/save")
    public String save() {
        System.out.println("user controller save ...");
        return "{'module': 'Hello spring mvc'}";
    }
}
