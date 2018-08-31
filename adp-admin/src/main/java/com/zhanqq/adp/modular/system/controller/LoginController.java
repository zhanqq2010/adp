package com.zhanqq.adp.modular.system.controller;

import com.zhanqq.adp.core.base.controller.BaseController;
import com.zhanqq.adp.core.response.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController extends BaseController {


    @RequestMapping("login")
     public JsonResult login(){
         return SUCCESS_TIP;
     }
}
