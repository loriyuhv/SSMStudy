package com.wsw.controller;

import com.wsw.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author loriyuhv
 * @date 2025/8/21
 * @description
 */
@Controller
public class UserController {
    /**
     * @description POST：新增
     */
    @ResponseBody
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String save(@RequestBody User user) {
        System.out.println("user controller save ..." + user);
        return "{'module': 'user save'}";
    }

    /**
     * @description DELETE：删除
     */
    @ResponseBody
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id) {
        System.out.println("user controller delete ..." + id);
        return "{'module': 'user delete'}";
    }

    /**
     * @description PUT：更新
     */
    @ResponseBody
    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    public String update(@RequestBody User user) {
        System.out.println("user controller update ..." + user);
        return "{'module': 'user update'}";
    }

    /**
     * @description getById
     */
    @ResponseBody
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable Integer id) {
        System.out.println("user controller getById ..." + id);
        return "{'module': 'user getById'}";
    }

    @ResponseBody
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getAll() {
        System.out.println("user controller getAll ..." );
        return "{'module': 'user getAll'}";
    }
}
