package com.wsw.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wsw.common.ErrorCode;
import com.wsw.common.ResultUtils;
import com.wsw.exception.BusinessException;
import com.wsw.model.domain.User;
import com.wsw.model.request.UserLoginRequest;
import com.wsw.model.request.UserRegisterRequest;
import com.wsw.common.ResponseStructure;
import com.wsw.model.response.UserLoginResult;
import com.wsw.model.response.UserRegisterResult;
import com.wsw.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static com.wsw.constant.UserConstant.ADMIN_ROLE;
import static com.wsw.constant.UserConstant.USER_LOGIN_STATE;

/**
 * 用户表现层
 * @author loriyuhv
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 用户登录
     * @param userLoginRequest 登录请求数据
     * @param request 请求体
     * @return 登录响应数据
     */
    @PostMapping("/login")
    public UserLoginResult userLogin(@RequestBody UserLoginRequest userLoginRequest, HttpServletRequest request) {
        if (userLoginRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        // 规范写法
        Boolean autoLogin = userLoginRequest.getAutoLogin();
        String type = userLoginRequest.getType();
        String password = userLoginRequest.getPassword();

        User user = null;
        if (type.equals("account")) {
            String username = userLoginRequest.getUsername();
            user = userService.userLoginAccount(username, password, request);
        } else if (type.equals("userid")) {
            String userid = userLoginRequest.getUserid();
            user = userService.userLoginUserid(userid, password, request);
        }

        if (user == null) {
            return ResultUtils.loginError(type, "guest");
        }

        return ResultUtils.loginSuccess(type, user.getAccess());
    }

    /**
     * 获取当前用户
     * @param request 请求信息
     * @return 返回数据脱敏后的用户信息
     */
    @GetMapping("/currentUser")
    public ResponseStructure<User> getCurrentUser(HttpServletRequest request) throws JSONException, NoSuchFieldException {
        Object userObj = request.getSession().getAttribute(USER_LOGIN_STATE);
        User currentUser = (User) userObj;
        if (currentUser == null) {
            throw new BusinessException(ErrorCode.NOT_LOGIN);
        }

        long userId = currentUser.getId();
        // todo 校验用户是否合法
        User user = userService.getById(userId);
        User safetyUser = userService.getSafetyUser(user);

        return ResultUtils.success(safetyUser);
    }

    /**
     * 用户注销
     * @param request 请求体
     * @return 返回状态值
     */
    @PostMapping("/login/outLogin")
    public ResponseStructure<Integer> userLogout(HttpServletRequest request) {
        if (request == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        int result = userService.userOutLog(request);
        return ResultUtils.success(result);
    }

    /**
     * 用户注册
     * @param userRegisterRequest 请求参数
     * @return 响应结果
     */
    @PostMapping("/register")
    public UserRegisterResult userRegister(@RequestBody UserRegisterRequest userRegisterRequest) {
        UserRegisterResult userRegisterResult = new UserRegisterResult("error");
        if (userRegisterRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        // 规范写法
        String username = userRegisterRequest.getUsername();
        String userid = userRegisterRequest.getUserid();
        String password = userRegisterRequest.getCheckPassword();
        String checkPassword = userRegisterRequest.getCheckPassword();

        if (StringUtils.isAnyBlank(username, userid, password, checkPassword)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        long result = userService.userRegister(userRegisterRequest);
        if (result < 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        userRegisterResult.setStatus("ok");
        return userRegisterResult;
    }

    @GetMapping("/search")
    public List<User> searchUsers(String username, HttpServletRequest request) {
        if (this.measureAdmin(request)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(username)) {
            queryWrapper.like("username", username);
        }
        List<User> userList = userService.list(queryWrapper);

        return userList.stream().map(user -> userService.getSafetyUser(user)).collect(Collectors.toList());
    }

    // @PostMapping("/delete")
    // public BaseResponse<Boolean> deleteUsers(@RequestBody long id, HttpServletRequest request) {
    //     if (this.measureAdmin(request)) {
    //         return null;
    //     }
    //
    //     if (id <= 0) {
    //         return null;
    //     }
    //     Boolean result = userService.removeById(id);
    //     return ResultUtils.success(result);
    // }

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
        return (user == null) || (!user.getAccess().equals(ADMIN_ROLE));
    }

}
