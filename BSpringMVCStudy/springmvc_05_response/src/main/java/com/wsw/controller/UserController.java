package com.wsw.controller;

import com.wsw.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/8/21
 * @description
 */
@Controller
public class UserController {
    /**
     * @description 响应页面/跳转界面
     * 注意1：此处不能添加@ResponseBody,如果加了该注入，
     *  会直接将page.jsp当字符串返回前端。
     * 注意2：方法需要返回String。
     */
    @RequestMapping("/toJumpPage")
    public String toJumpPage() {
        System.out.println("跳转页面！！！");
        return "page.jsp";
    }

    /**
     * @description 响应文本数据
     */
    // 此处注解不能省略，否则会将response text当作页面名称查找，导致404错误。
    @ResponseBody
    @RequestMapping("/toText")
    public String toText() {
        System.out.println("返回纯文本数据");
        return "response text";
    }

    /**
     * @description 响应POJO对象
     */
    @ResponseBody
    @RequestMapping("/toJsonPOJO")
    public User toJsonPOJO() {
        System.out.println("返回json对象数据");
        User user = new User();
        user.setName("Jerry");
        user.setAge(24);
        return user;
    }

    /**
     * @description 响应POJO集合对象
     */
    @ResponseBody
    @RequestMapping("/toJsonList")
    public List<User> toJsonList() {
        System.out.println("返回json集合数据");
        User user1 = new User();
        user1.setName("Jerry");
        user1.setAge(24);
        User user2 = new User();
        user2.setName("Tom");
        user2.setAge(25);
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        return userList;
    }

}
