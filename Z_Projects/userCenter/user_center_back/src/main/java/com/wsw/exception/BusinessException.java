package com.wsw.exception;

import com.wsw.common.ErrorCode;
import com.wsw.common.ErrorShowType;

import java.io.Serial;

public class BusinessException extends RuntimeException{

    private int code;
    // private ErrorShowType showType;
    private int showType;

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.showType = errorCode.getErrorShowType();
    }

    public int getCode() {
        return code;
    }

    public int getShowType() {
        return showType;
    }

    @Serial
    private static final long serialVersionUID = 5172137868764232650L;
}
