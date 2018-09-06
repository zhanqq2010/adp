package com.zhanqq.adp.core.base.controller;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @ClassName AdpErrorView
 * @Description TODO
 * @Author zhanqq
 * @Date 2018/9/6 18:20
 * @Version 1.0
 **/
public class AdpErrorView implements View {
    @Nullable
    @Override
    public String getContentType() {
        return "text/html";
    }

    @Override
    public void render(@Nullable Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        httpServletRequest.getRequestDispatcher("/global/error").forward(httpServletRequest, httpServletResponse);
    }
}
