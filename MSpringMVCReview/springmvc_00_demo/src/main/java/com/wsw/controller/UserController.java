package com.wsw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author loriyuhv
 * @date 2025/8/22
 * @description
 */
@Controller
@RequestMapping("/users")
public class UserController {
    @ResponseBody
    @RequestMapping("/delete")
    public String delete(String name) {
        System.out.println("user controller delete ==> " + name);
        return "{'module': 'user delete'}";
    }
}
