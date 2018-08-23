package com.zhanqq.admin.modular.system.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.zhanqq.admin.core.response.JsonResult;
import com.zhanqq.admin.core.response.ResultGenerator;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LoginController
 * @Description 登录控制器
 * @Author zhanqq
 * @Date 2018/8/2216:05
 * @Version 1.0
 **/
@RestController
public class LoginController {

    @RequestMapping("/login")
    public JsonResult login(){


        return ResultGenerator.genSuccessResult();
    }
}
