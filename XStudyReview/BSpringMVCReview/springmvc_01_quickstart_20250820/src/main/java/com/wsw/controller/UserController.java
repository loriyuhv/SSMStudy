package com.wsw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author loriyuhv
 * @date 2025/8/20
 * @description User表现层
 */
@Controller
public class UserController {
    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        return "Hello spring mvc!!!";
    }
}
