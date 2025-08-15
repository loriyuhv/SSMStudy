package com.wsw.controller;

import com.wsw.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author loriyuhv
 * @date 2025/8/15
 * @description User表现层
 */
@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("user controller save ...");
        userService.save();
        return "{'user': 'spring mvc'}";
    }
}
