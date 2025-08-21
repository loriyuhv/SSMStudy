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
@RequestMapping("/book")
public class BookController {
    @ResponseBody
    @RequestMapping("/save")
    public String save() {
        System.out.println("book save ...");
        return "{'module': 'book save'}";
    }

    @ResponseBody
    @RequestMapping("/delete")
    public String delete() {
        System.out.println("book delete ...");
        return "{'module': 'book delete'}";
    }
}
