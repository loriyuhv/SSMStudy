package com.wsw.usercenter01.model.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户注册请求体
 * @author loriyuhv
 */
@Data
public class UserRegisterRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 7452662700328355545L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
}
