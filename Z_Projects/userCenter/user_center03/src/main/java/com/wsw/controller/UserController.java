package com.wsw.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wsw.domain.User;
import com.wsw.model.request.UserLoginRequest;
import com.wsw.model.request.UserRegisterRequest;
import com.wsw.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.wsw.constant.UserConstant.ADMIN_ROLE;
import static com.wsw.constant.UserConstant.USER_LOGIN_STATE;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
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
        String userAccount = userLoginRequest.getUserAccount();
        String userPassword = userLoginRequest.getUserPassword();
        if (StringUtils.isAnyBlank(userAccount, userPassword)) {
            return null;
        }
        return userService.userLogin(userAccount, userPassword, request);
    }

    /**
     * 管理员查询用户信息
     * @param username 用户昵称
     * @param request 请求体
     * @return 查询到的用户信息
     */
    @GetMapping("/search")
    public List<User> searchUsers(String username, HttpServletRequest request) {
        // 1. 鉴权:调用自定义方法鉴定用户是否管理员
        if (measureAdmin(request)) {
            // 1）否：返回空List<>
            return new ArrayList<>();
        }
        // 2. 判断查询值username是否为空
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(username)) {
            // 1）不是空就查询搜索的用户
            queryWrapper.eq("username", username);
        }
        // 3. 根据查询条件查询用户
        List<User> users = userService.list(queryWrapper);
        // 3. 返回
        return users.stream().map(user -> userService.getSafeUser(user)).collect(Collectors.toList());
    }

    private boolean measureAdmin(HttpServletRequest request) {
        // 仅管理员可查询
        Object userObject = request.getSession().getAttribute(USER_LOGIN_STATE);
        User user = (User) userObject;
        // User user = (User) null;
        if (user == null) {
            return true;
        }
        // return user.getRole() != ADMIN_ROLE;
        return user.getUserRole() != ADMIN_ROLE;
    }

}
