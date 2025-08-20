package com.wsw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author loriyuhv
 * @date 2025/8/20
 * @description
 */
// @Controller
@Controller
@RequestMapping("/user")
public class UserController {
    // 普通参数
    @ResponseBody
    @GetMapping("/commonParam")
    public String commonParam(String name) { // spring-webmvc 6.1版本之后不支持这个了
    // public String commonParam(@RequestParam("name") String name) {
        System.out.println("普通参数传递 name ==>" + name);
        return "{'module': 'common param'}";
    }
}
