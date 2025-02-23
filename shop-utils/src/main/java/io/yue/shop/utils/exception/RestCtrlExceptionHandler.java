package io.yue.shop.utils.exception;

import io.yue.shop.utils.constants.HttpCode;
import io.yue.shop.utils.resp.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 东行
 * @version 1.0.0
 * @description 全局异常处理器
 */
@RestControllerAdvice
public class RestCtrlExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(RestCtrlExceptionHandler.class);
    /**
     * 全局异常处理器,统一返回状态码
     */
    @ExceptionHandler
    public Result<String> handleException(Exception e) {
        logger.error("服务器抛出异常");
        return new Result<String>(HttpCode.FAILURE, "执行失败", e.getMessage());
    }

}
