package com.wsw.controller;

import com.wsw.domain.User;
import com.wsw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author loriyuhv
 * @ClassName UserController
 * @date 2024/4/9 19:45
 * @description TODO
 */

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("user save ...");
        userService.save(new User());
        return "{'msg': 'spring mvc'}";
    }
}
