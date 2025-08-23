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
@RequestMapping("/book")
public class BookController {
    @ResponseBody
    @RequestMapping("/save")
    public String save() {
        System.out.println("book save ...");
        return "{'module': 'book save'}";
    }
}
