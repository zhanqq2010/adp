package com.zhanqq.adp.admin.core.response;

/**
 * @ClassName ResultCode
 * @Description 响应码枚举，参考HTTP状态码的语义
 * @Author zhanqq
 * @Date 2018/8/2216:10
 * @Version 1.0
 **/
public enum  ResultCode {
    SUCCESS(200),//成功
    FAIL(400),//失败
    UNAUTHORIZED(401),//未认证（签名错误）
    NOT_FOUND(404),//接口不存在
    INTERNAL_SERVER_ERROR(500);//服务器内部错误

    private final int code;

    ResultCode(int code) {
        this.code = code;
    }

    public int code() {
        return code;
    }
}
