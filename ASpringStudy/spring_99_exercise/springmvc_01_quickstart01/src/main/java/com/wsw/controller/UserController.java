package com.wsw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author loriyuhv
 * @ClassName UserController
 * @date 2024/4/27 1:50
 * @description TODO
 */

@Controller
public class UserController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "{'msg': 'hello world!'";
    }
}
