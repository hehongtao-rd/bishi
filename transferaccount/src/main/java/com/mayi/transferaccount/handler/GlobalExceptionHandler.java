package com.mayi.transferaccount.handler;

import com.mayi.transferaccount.response.ResultBody;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 简单的统一异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = RuntimeException.class)
    public ResultBody handleException(RuntimeException exception) {
        ResultBody result = new ResultBody(exception);
        return result;
    }
}
