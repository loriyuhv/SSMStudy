package com.wsw.usercenter01.service;

import com.wsw.usercenter01.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
* @author 23859
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2023-12-06 16:33:52
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String plantCode);

    /**
     * 用户登录
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     * @param originUser 源user对象
     * @return 安全的user对象
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     * @param request 请求体
     */
    int userLogout(HttpServletRequest request);
}
