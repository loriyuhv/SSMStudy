package com.wsw.exception;

import com.wsw.common.ResponseStructure;
import com.wsw.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ResponseStructure businessExceptionHandler(BusinessException e) {
        log.error("businessException" + e.getMessage(), e);
        return ResultUtils.error(e.getCode(), e.getMessage(), e.getShowType());
    }

    // @ExceptionHandler(RuntimeException.class)
    // public BaseResponse runtimeExceptionHandler(RuntimeException e) {
    //     log.error("runtimeException", e);
    //     return ResultUtils.error(ErrorCode.SYSTEM_ERROR, e.getMessage(), "");
    // }

}
