package com.wsw.model.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class UserLoginRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = -9026929079263886435L;

    private String userAccount;
    private String userPassword;
}
