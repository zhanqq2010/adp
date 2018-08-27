package com.zhanqq.adp.admin.modular.system.controller;

import com.zhanqq.adp.admin.core.response.JsonResult;
import com.zhanqq.adp.admin.core.response.ResultGenerator;
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
