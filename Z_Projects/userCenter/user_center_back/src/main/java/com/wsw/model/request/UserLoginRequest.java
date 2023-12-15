package com.wsw.model.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户登录请求体
 * @author loriyuhv
 */
@Data
public class UserLoginRequest implements Serializable {
    /**
     * 是否自动登录
     */
    private Boolean autoLogin;

    /**
     * 用户登录密码
     */
    private String password;

    /**
     * 用户登录账号
     */
    private String username;

    /**
     * 用户登录编号
     */
    private String userid;

    /**
     * 用户登录方式：account 账户 userid 编号
     */
    private String type;


    @Serial
    private static final long serialVersionUID = -9026929079263886435L;
}
