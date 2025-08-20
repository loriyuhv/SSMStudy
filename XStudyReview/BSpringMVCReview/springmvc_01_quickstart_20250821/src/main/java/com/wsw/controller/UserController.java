package com.wsw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author loriyuhv
 * @date 2025/8/21
 * @description
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @ResponseBody
    @RequestMapping("/save")
    public String save() {
        System.out.println("你好Spring MVC！！！");
        return "Hello spring svc.";
    }
}
