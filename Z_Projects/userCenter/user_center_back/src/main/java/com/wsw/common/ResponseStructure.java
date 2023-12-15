package com.wsw.common;

import com.wsw.common.ErrorShowType;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 响应失败的结果
 * @param <T>
 */
@Data
public class ResponseStructure<T> implements Serializable {

    private boolean success;
    private T data;
    private int errorCode;
    private String errorMessage;
    // private ErrorShowType showType;
    private int showType;

    public ResponseStructure(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public ResponseStructure(boolean success, T data, int errorCode, String errorMessage, int showType) {
        this.success = success;
        this.data = data;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.showType = showType;
    }

    @Serial
    private static final long serialVersionUID = 385638220411817447L;
}
