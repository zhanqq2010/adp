package com.zhanqq.admin.core.response;

import com.alibaba.fastjson.JSON;

/**
 * @ClassName JsonResult
 * @Description 统一API响应结果封装
 * @Author zhanqq
 * @Date 2018/8/2216:07
 * @Version 1.0
 **/
public class JsonResult {

    private int code;
    private String message;
    private Object data;

    public JsonResult setCode(ResultCode resultCode) {
        this.code = resultCode.code();
        return this;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public JsonResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public JsonResult setData(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
