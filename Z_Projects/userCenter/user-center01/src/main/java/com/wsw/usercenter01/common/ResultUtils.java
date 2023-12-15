package com.wsw.usercenter01.common;

/**
 * 返回工具类
 * @author loriyuhv
 */
public class ResultUtils {
    /**
     * success
     * @param data 信息
     * @return 返回响应数据
     * @param <T> 泛型
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(200, data, "ok");
    }

    /**
     * error
     * @param errorCode 错误信息
     * @return 响应数据
     * @param <T> 泛型
     */
    public static <T> BaseResponse<T> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    public static <T> BaseResponse<T> error(ErrorCode errorCode, String message, String description) {
        return new BaseResponse<>(errorCode.getCode(), null, message, description);
    }

    public static <T> BaseResponse<T> error(int code, String message, String description) {
        return new BaseResponse<>(code, null, message, description);
    }
}
