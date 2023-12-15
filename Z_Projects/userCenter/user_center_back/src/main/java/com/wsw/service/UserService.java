package com.wsw.service;

import com.wsw.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wsw.model.request.UserRegisterRequest;
import jakarta.servlet.http.HttpServletRequest;

/**
* @author loriyuhv
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2023-12-13 14:39:20
*/
public interface UserService extends IService<User> {

    /**
     * 用户登录接口，登录方式为账户形式
     * @return UserLoginResult
     */
    User userLoginAccount(String username, String password, HttpServletRequest request);

    /**
     * 用户登录接口，登录方式为编号形式
     * @return UserLoginResult
     */
    User userLoginUserid(String userid, String password, HttpServletRequest request);


    /**
     * 用户信息脱敏接口
     * @param originUser 源user对象
     * @return 安全的user对象
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     * @param request 请求体
     */
    int userOutLog(HttpServletRequest request);

    /**
     * 用户注册接口
     * @param userRegisterResult 用户注册请求信息
     * @return 新用户 id
     */
    long userRegister(UserRegisterRequest userRegisterResult);

}
