package com.zhanqq.admin;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @ClassName adminServletInitializer
 * @Description TODO
 * @Author zhanqq
 * @Date 2018/8/2116:53
 * @Version 1.0
 **/
public class adminServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AdminApplication.class);
    }
}
