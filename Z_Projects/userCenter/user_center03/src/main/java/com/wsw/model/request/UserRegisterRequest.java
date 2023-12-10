package com.wsw.model.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class UserRegisterRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = 7626295552247991374L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
}
