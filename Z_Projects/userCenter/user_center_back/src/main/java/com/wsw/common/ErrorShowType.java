package com.wsw.common;


import lombok.Getter;

/**
 * 常见异常类型代码值
 */
@Getter
public enum ErrorShowType {
    /**
     * 简单异常处理代码值
     */
    SILENT(0),
    /**
     * 警告异常处理代码值
     */
    WARN_MESSAGE(1),
    /**
     * 严重异常处理代码值
     */
    ERROR_MESSAGE(2),
    /**
     * 异常通知处理代码值
     * */
    NOTIFICATION(3),
    /**
     * 异常跳转处理代码值
     */
    REDIRECT(9);

    /**
     * 状态码
     */
    private final int number;

    ErrorShowType(int number) {
        this.number = number;
    }
}
