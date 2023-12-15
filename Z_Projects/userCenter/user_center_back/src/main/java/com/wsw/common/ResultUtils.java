package com.wsw.common;

import com.wsw.model.response.UserLoginResult;

import java.lang.reflect.Field;

/**
 * 返回工具类
 */
public class ResultUtils {

    /**
     * 返回获取成功响应数据
     * @param data  数据
     * @return 数据
     * @param <T> 数据类型
     */
    public static <T> ResponseStructure<T> success(T data) {
        return new ResponseStructure<>(true, data);
    }

    /**
     * 返回登录成功响应值
     * @param account 用户登录方式
     * @param access 用户注册类型
     * @return 返回响应数据对象UserLogResult
     */
    public static UserLoginResult loginSuccess(String account, String access) {
        return new UserLoginResult("ok", account, access);
    }

    /**
     * 返回登录失败响应值
     * @param account 用户登录方式
     * @param access 用户注册类型
     * @return 返回响应数据对象UserLogResult
     */
    public static UserLoginResult loginError(String account, String access) {
        return new UserLoginResult("error", account, access);
    }

    /**
     * error
     * @param errorCode 错误信息
     * @return 响应数据
     * @param <T> 泛型
     */
    public static <T> ResponseStructure<T> error(int errorCode, String errorMessage, int showType) {
        return new ResponseStructure<>(false, null, errorCode, errorMessage, showType);
    }
}
