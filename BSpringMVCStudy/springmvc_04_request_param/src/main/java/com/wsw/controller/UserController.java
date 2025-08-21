package com.wsw.controller;

import com.wsw.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/8/22
 * @description
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * @description 普通参数
     */
    @ResponseBody
    @RequestMapping("/commonParam")
    public String commonParam(String name, int age) {
        System.out.println("普通参数传递 name ==>" + name);
        System.out.println("普通参数传递 age ==>" + age);
        return "{'module': 'commonParam'}";
    }

    /**
     * @description 参数不同名：
     * 如果形参与地址参数名不一致, 解决办法，加@RequestParam("name")
     */
    @ResponseBody
    @RequestMapping("/commonParamDifferentName")
    public String commonParamDifferentName(@RequestParam("name") String username, int age) {
        System.out.println("普通参数传递 name ===>" + username);
        System.out.println("普通参数传递 age ===>" + age);
        return "{'module': 'commonParamDifferentName'}";
    }

    /**
     * @description POJO类型参数：
     * 请求参数与形参对象中的属性对应即可完成参数传递
     */
    @ResponseBody
    @RequestMapping("/pojoParam")
    public String pojoParam(User user) {
        System.out.println("pojo参数传递 ===>" + user);
        return "{'module': ''pojoParam'}";
    }

    /**
     * @description 嵌套POJO类型参数：
     * 请求参数与形参对象中的属性对应即可完成参数传递
     */
    @ResponseBody
    @RequestMapping("/pojoContainPojoParam")
    public String pojoContainPojoParam(User user) {
        System.out.println("pojo嵌套pojo参数传递 ===> " + user);
        return "{'module': 'pojoContainPojoParam'}";
    }

    /**
     * @description 数组类型参数：
     * 同名请求参数可以直接映射到对应名称的形参数组对象中。
     */
    @ResponseBody
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] likes) {
        System.out.println("数组参数传递 likes ==> " + Arrays.toString(likes));
        return  "{'module': 'arrayParam'}";
    }

    /**
     * @description 集合类型参数：
     * 同名请求参数可以使用@RequestParam注解映射到对应名称的集合对象中
     * 作为数据。
     */
    @ResponseBody
    @RequestMapping("/listParam")
    public String listParam(@RequestParam("likes") List<String> likes) {
        System.out.println("集合参数传递 ===> " + likes);
        return "{'module': 'listParam'}";
    }

    /**
     * @description JSON普通数组参数：
     * 使用@RequestBody注解将外部传递的json数组映射到形参的集合对象中作为数据
     */
    @ResponseBody
    @RequestMapping("/listParamForJson")
    // 接收json数据步骤三：使用@RequestBody修饰接受参数
    public String listParamForJson(@RequestBody List<String> likes) {
        System.out.println("list common(json)参数传递 likes ===> " + likes);
        return "{'module': 'listParamForJson'}";
    }

    /**
     * @description JSON对象参数：
     */
    @ResponseBody
    @RequestMapping("/pojoParamForJson")
    public String pojoParamForJson(@RequestBody User user) {
        System.out.println("pojo(json)参数传递 user ==> " + user);
        return "{'module': 'pojoParamForJson'}";
    }

    /**
     * @description JSON对象数组参数：
     */
    @ResponseBody
    @RequestMapping("/listPojoParamForJson")
    public String listPojoParamForJson(@RequestBody List<User> users) {
        System.out.println("list pojo(json)参数传递 ==> " + users);
        return "{'module': 'listPojoParamForJson'}";
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
