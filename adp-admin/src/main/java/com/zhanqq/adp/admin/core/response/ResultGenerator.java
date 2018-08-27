package com.zhanqq.adp.admin.core.response;

/**
 * @ClassName ResultGenerator
 * @Description 响应结果生成工具
 * @Author zhanqq
 * @Date 2018/8/2216:13
 * @Version 1.0
 **/
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static JsonResult genSuccessResult() {
        return new JsonResult()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    public static JsonResult genSuccessResult(Object data) {
        return new JsonResult()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static JsonResult genFailResult(String message) {
        return new JsonResult()
                .setCode(ResultCode.FAIL)
                .setMessage(message);
    }
}
