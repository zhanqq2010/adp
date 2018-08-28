package com.zhanqq.adp.admin.modular.system.controller;

import com.zhanqq.adp.admin.core.response.JsonResult;
import com.zhanqq.adp.admin.core.response.ResultGenerator;
import com.zhanqq.adp.admin.modular.system.model.Menu;
import com.zhanqq.adp.admin.modular.system.model.User;
import com.zhanqq.adp.admin.modular.system.service.IMenuService;
import com.zhanqq.adp.admin.modular.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
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


    @Autowired
    private IMenuService menuService;

    @RequestMapping("/login")
    public JsonResult login(){
        Menu menu = new Menu();
        menu.setName("111");
        menuService.insert(menu);

        return ResultGenerator.genSuccessResult();
    }
}
