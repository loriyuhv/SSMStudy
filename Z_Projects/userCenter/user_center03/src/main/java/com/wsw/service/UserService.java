package com.wsw.service;

import com.wsw.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
 * 用户服务接口
* @author loriyuhv
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2023-12-09 15:34:49
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册接口
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 用户校验密码
     * @return 状态值
     */
    public long userRegister(String userAccount, String userPassword, String checkPassword);


    /**
     * 用户登录接口
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param request 用户请求体
     * @return  响应体（数据脱敏的用户信息）
     */
    public User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户信息脱敏
     * @param originUser 源user对象
     * @return 安全的user对象
     */
    User getSafeUser(User originUser);
}
