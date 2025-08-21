package com.wsw.controller;

import com.wsw.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/8/20
 * @description
 */
@Controller
@RequestMapping("/user")
public class UserController {
    // 普通参数
    @ResponseBody
    @RequestMapping("/commonParam")
    public String commonParam(String name, int age) {
        System.out.println("普通参数传递 name ==>" + name);
        System.out.println("普通参数传递 age ==>" + age);
        return "{'module': 'common param'}";
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
     * @description 嵌套POJO参数
     */
    @RequestMapping("/pojoContainPojoParam")
    @ResponseBody
    public String pojoContainPojoParam(User user) {
        System.out.println("pojo嵌套pojo参数传递 ===>" + user);
        return "{'module': ''pojo contain pojo param'}";
    }

    /**
     * @description 数组参数:同名请求参数可以直接映射到对应名称的形参数组对象中
     */
    @ResponseBody
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] likes) {
        System.out.println("数组参数传递 likes==> " + Arrays.toString(likes));
        return  "{'module': 'array param'}";
    }

    /**
     * @description 集合参数：同名请求参数可以使用@RequestParam注解映射到
     * 对应名称的集合对象中作为数据。
     */
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam("hobbies") List<String> hobbies) {
        System.out.println("集合参数传递 ===>" + hobbies);
        return "{'module': ''list param'}";
    }

    /**
     * @description 集合参数：json格式，数组
     * 使用@RequestBody注解将外部传递的json数组映射到形参的集合对象中作为数据
     */
    @ResponseBody
    @RequestMapping("/listParamForJson")
    // 接收json数据步骤三：使用@RequestBody修饰接受参数
    public String listParamForJson(@RequestBody List<String> hobbies) {
        System.out.println("list common(json)参数传递 list ===> " + hobbies);
        return "{'module': 'list common for json param'}";
    }

    /**
     * @description POJO参数：json格式，对象
     */
    @ResponseBody
    @RequestMapping("/pojoParamForJson")
    public String pojoParamForJson(@RequestBody User user) {
        System.out.println("pojo(json)参数传递 user ==> " + user);
        return "{'module': 'pojo param for json'}";
    }

    /**
     * @description 集合参数：json格式：List[User]
     */
    @ResponseBody
    @RequestMapping("/listPojoParamForJson")
    public String listPojoParamForJson(@RequestBody List<User> users) {
        System.out.println("list pojo(json)参数传递 ==> " + users);
        return "{'module': 'list pojo param for json'}";
    }

    /**
     * @description 日期参数
     */
    @ResponseBody
    @RequestMapping("/dateParam")
    public String dateParam(
            Date date1,
            @DateTimeFormat(pattern="yyyy-MM-dd") Date date2,
            @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date date3) {
        System.out.println("参数传递 date1 ==> " + date1);
        System.out.println("参数传递 date2 ==> " + date2);
        System.out.println("参数传递 date3 ==> " + date3);
        return "{'module': 'date param'}";
    }


}