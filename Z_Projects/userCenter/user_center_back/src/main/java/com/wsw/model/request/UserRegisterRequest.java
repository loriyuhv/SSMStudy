package com.wsw.model.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class UserRegisterRequest implements Serializable {
    /**
     * 用户注册账号
     */
    private String username;
    /**
     * 用户注册编号
     */
    private String userid;
    /**
     * 用户注册密码
     */
    private String password;
    /**
     * 用户校验密码
     */
    private String checkPassword;
    /**
     * 是否回显数据
     */
    private Boolean autoData;

    @Serial
    private static final long serialVersionUID = 7626295552247991374L;
}
