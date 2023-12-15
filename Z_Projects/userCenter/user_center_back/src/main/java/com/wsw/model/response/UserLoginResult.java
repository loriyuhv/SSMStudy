package com.wsw.model.response;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户登录响应体
 */
@Data
public class UserLoginResult implements Serializable {
    /**
     * 响应状态 ok 成功 error 失败
     */
    private String status;
    /**
     * 登录方式：account 账户 userid 编号
     */
    private String type;
    /**
     * 登录角色：admin：管理员 user：游客 guest：访客
     */
    private String currentAuthority;

    public UserLoginResult(String status, String type, String currentAuthority) {
        this.status = status;
        this.type = type;
        this.currentAuthority = currentAuthority;
    }

    @Serial
    private static final long serialVersionUID = -5221497876182591399L;
}
