package com.wsw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author loriyuhv
 * @ClassName UserController
 * @date 2024/4/9 7:54
 * @description
 * 2. 定义controller
 * // 2.1 使用controller定义bean
 */

/**
 * @description 2. 定义controller
 * 2.1 使用controller定义bean
 */
@Controller
public class UserController {

    // 2.2 这是当前操作的请求路径
    @RequestMapping("/save")
    // 2.3 设置当前操作的返回值类型
    @ResponseBody
    public String save() {
        System.out.println("user save ...");
        return "{'msg': 'springmvc'}";
    }
}
