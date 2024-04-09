package com.wsw.controller;

import com.wsw.domain.Address;
import com.wsw.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.JstlUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author loriyuhv
 * @ClassName UserController
 * @date 2024/4/9 21:48
 * @description TODO
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("user save ...");
        return "{'module': 'user save'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete() {
        System.out.println("user delete ...");
        return "{'module': 'user delete'}";
    }

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name, int age) {
        System.out.println("普通参数传递 name ===>" + name);
        System.out.println("普通参数传递 age ===>" + age);
        return "{'module': 'commonParam'}";
    }
    
    /** 
     * @description 如果形参与地址参数名不一致, 解决办法，加@RequestParam("name")
     */
    @RequestMapping("/commonParamDifferentName")
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String username, int age) {
        System.out.println("普通参数传递 name ===>" + username);
        System.out.println("普通参数传递 age ===>" + age);
        return "{'module': ''common param different name'}";
    }
    
    /** 
     * @description //POJO参数：请求参数与形参对象中的属性对应即可完成参数传递
     */
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user) {
        System.out.println("pojo参数传递 ===>" + user);
        return "{'module': ''pojo param'}";
    }

    /**
     * @description 数组参数：同名请求参数可以直接映射到对应名称的形参数组对象中
     */
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] hobby) {
        System.out.println("数组参数传递 ===>" + Arrays.toString(hobby));
        return "{'module': ''array param'}";
    }

    /**
     * @description //集合参数：同名请求参数可以使用@RequestParam
     *  注解映射到对应名称的集合对象中作为数据
     * 会报错：解决方案：加入@RquestParam
     */
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> hobby) {
        System.out.println("集合参数传递 ===>" + hobby);
        return "{'module': ''list param'}";
    }
    
    /** 
     * @description 使用@RequestBody注解将外部传递的json数组映射到形参的集合对象中作为数据
     */
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> hobby) {
        System.out.println("list common(json)参数传递 list ===> " + hobby);
        return "{'module': 'list common for json param'}";
    }
}
