package com.wsw.usercenter01.model.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户登录请求体
 * @author loriyuhv
 */
@Data
public class UserLoginRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = -7746494709745832204L;

    private String userAccount;
    private String userPassword;
}
