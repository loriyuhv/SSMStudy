package com.wsw.usercenter01.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.wsw.usercenter01.common.BaseResponse;
import com.wsw.usercenter01.common.ErrorCode;
import com.wsw.usercenter01.common.ResultUtils;
import com.wsw.usercenter01.exception.BusinessException;
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
    public BaseResponse<Long> userRegister(@RequestBody UserRegisterRequest userRegisterRequest) {
        if (userRegisterRequest == null) {
            // return ResultUtils.error(ErrorCode.PARAMS_ERROR);
            throw  new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        // 规范写法
        String userAccount = userRegisterRequest.getUserAccount();
        String userPassword = userRegisterRequest.getUserPassword();
        String checkPassword = userRegisterRequest.getCheckPassword();
        String plantCode = userRegisterRequest.getPlantCode();

        if (StringUtils.isAnyBlank(userAccount, userPassword, checkPassword, plantCode)) {
            return null;
        }

        long result = userService.userRegister(userAccount, userPassword, checkPassword, plantCode);
        // return new BaseResponse<Long>(200, result, "ok");
        return ResultUtils.success(result);
    }

    @PostMapping("/login")
    public BaseResponse<User> userLogin(@RequestBody UserLoginRequest userLoginRequest, HttpServletRequest request) {
        if (userLoginRequest == null) {
            return null;
        }
        // 规范写法
        String userAccount = userLoginRequest.getUserAccount();
        String userPassword = userLoginRequest.getUserPassword();
        // String userAccount = userLoginRequest.getUsername();
        // String userPassword = userLoginRequest.getPassword();
        if (StringUtils.isAnyBlank(userAccount, userPassword)) {
            return null;
        }

        User user = userService.userLogin(userAccount, userPassword, request);
        // return new BaseResponse<>(200, user, "ok");
        return ResultUtils.success(user);
    }

    /**
     * 用户注销
     * @param request 请求体
     * @return 返回状态值
     */
    @PostMapping("/logout")
    public BaseResponse<Integer> userLogout(HttpServletRequest request) {
        if (request == null) {
            return null;
        }
        int result = userService.userLogout(request);
        return ResultUtils.success(result);
    }

    /**
     * 获取当前用户
     * @param request 请求信息
     * @return 返回数据脱敏后的用户信息
     */
    @GetMapping("/current")
    public BaseResponse<User> getCurrentUser(HttpServletRequest request) {
        Object userObj = request.getSession().getAttribute(USER_LOGIN_STATE);
        User currentUser = (User) userObj;
        if (currentUser == null) {
            return null;
        }
        long userId = currentUser.getId();
        // todo 校验用户是否合法
        User user = userService.getById(userId);
        User result = userService.getSafetyUser(user);
        return ResultUtils.success(result);
    }

    @GetMapping("/search")
    public BaseResponse<List<User>> searchUsers(String username, HttpServletRequest request) {
        if (this.measureAdmin(request)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
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
        List<User> result = userList.stream().map(user -> userService.getSafetyUser(user)).collect(Collectors.toList());
        return ResultUtils.success(result);
    }

    @PostMapping("/delete")
    public BaseResponse<Boolean> deleteUsers(@RequestBody long id, HttpServletRequest request) {
        if (this.measureAdmin(request)) {
            return null;
        }

        if (id <= 0) {
            return null;
        }
        Boolean result = userService.removeById(id);
        return ResultUtils.success(result);
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