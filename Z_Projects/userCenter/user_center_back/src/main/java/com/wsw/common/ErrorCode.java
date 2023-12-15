package com.wsw.common;

import lombok.Getter;

@Getter
public enum ErrorCode {
    PARAMS_ERROR(40000, "请求参数错误", ErrorShowType.ERROR_MESSAGE.getNumber()),
    NULL_ERROR(40001,"请求数据为空",ErrorShowType.ERROR_MESSAGE.getNumber()),
    NOT_LOGIN(40100, "未登录", ErrorShowType.ERROR_MESSAGE.getNumber()),
    NO_AUTH(40101, "无权限", ErrorShowType.ERROR_MESSAGE.getNumber()),
    SYSTEM_ERROR(50000, "系统内部异常", ErrorShowType.ERROR_MESSAGE.getNumber());

    /**
     * 状态码值
     */
    private final int code;
    /**
     * 状态码信息
     */
    private final String message;
    /**
     * 状态码描述（详情）
     */
    private final int errorShowType;

    ErrorCode(int code, String message, int errorShowType) {
        this.code = code;
        this.message = message;
        this.errorShowType = errorShowType;
    }
}
