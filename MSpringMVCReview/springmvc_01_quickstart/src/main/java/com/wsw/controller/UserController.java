package com.wsw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author loriyuhv
 * @date 2025/8/23
 * @description
 */
@Controller
public class UserController {
    @ResponseBody
    @RequestMapping("/user/save")
    public String save() {
        System.out.println("user controller save ...");
        return "{'module': 'spring mvc'}";
    }
}
