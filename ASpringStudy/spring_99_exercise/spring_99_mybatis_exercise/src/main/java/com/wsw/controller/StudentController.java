package com.wsw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author loriyuhv
 * @ClassName StudentController
 * @date 2024/4/27 1:26
 * @description TODO
 */

@Controller
public class StudentController {

    @RequestMapping("/student")
    @ResponseBody
    public String student() {
        System.out.println("student save ...");
        return "student save ...";
    }
}
