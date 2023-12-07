package com.wsw.usercenter01.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wsw.usercenter01.model.domain.User;
import com.wsw.usercenter01.model.request.UserLoginRequest;
import com.wsw.usercenter01.model.request.UserRegisterRequest;
import com.wsw.usercenter01.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.wsw.usercenter01.constant.UserConstant.ADMIN_ROLE;
import static com.wsw.usercenter01.constant.UserConstant.USER_LOGIN_STATE;

/**
 * 用户接口
 * @author loriyuhv
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/register")
    public Long userRegister(@RequestBody UserRegisterRequest userRegisterRequest) {
        if (userRegisterRequest == null) {
            return null;
        }
        // 规范写法
        String userAccount = userRegisterRequest.getUserAccount();
        String userPassword = userRegisterRequest.getUserPassword();
        String checkPassword = userRegisterRequest.getCheckPassword();

        if (StringUtils.isAnyBlank(userAccount, userPassword, checkPassword)) {
            return null;
        }

        return userService.userRegister(userAccount, userPassword, checkPassword);
    }

    @PostMapping("/login")
    public User userLogin(@RequestBody UserLoginRequest userLoginRequest, HttpServletRequest request) {
        if (userLoginRequest == null) {
            return null;
        }
        // 规范写法
        String userAccount = userLoginRequest.getUserAccount();
        String userPassword = userLoginRequest.getUserPassword();

        if (StringUtils.isAnyBlank(userAccount, userPassword)) {
            return null;
        }

        return userService.userLogin(userAccount, userPassword, request);
    }

    @GetMapping("/search")
    public List<User> searchUsers(String username, HttpServletRequest request) {
        if (this.measureAdmin(request)) {
            return new ArrayList<>();
        }

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(username)) {
            queryWrapper.like("username", username);
        }
        List<User> userList = userService.list(queryWrapper);
        // return userList.stream().map(user -> {
        //     user.setUserPassword(null);
        //     return userService.getSafetyUser(user);
        // }).collect(Collectors.toList());
        return userList.stream().map(user -> userService.getSafetyUser(user)).collect(Collectors.toList());
    }

    @PostMapping("/delete")
    public boolean deleteUsers(@RequestBody long id, HttpServletRequest request) {
        if (this.measureAdmin(request)) {
            return false;
        }

        if (id <= 0) {
            return false;
        }
        return userService.removeById(id);
    }

    /**
     * 判断用户是否是管理员
     * @param request 浏览器请求参数
     * @return 是否
     */
    private boolean measureAdmin(HttpServletRequest request) {
        // 仅管理员可查询
        Object userObj = request.getSession().getAttribute(USER_LOGIN_STATE);
        // User user = (User) null;
        User user = (User) userObj;
        // return user.getRole() != ADMIN_ROLE;
        return (user == null) || (user.getUserRole() != ADMIN_ROLE);
    }
}
