package com.wsw.model.response;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class UserRegisterResult implements Serializable {

    /**
     * 响应状态 ok 成功 error 失败
     */
    private String status;

    public UserRegisterResult(String status) {
        this.status = status;
    }

    @Serial
    private static final long serialVersionUID = 3146951312676298934L;
}
