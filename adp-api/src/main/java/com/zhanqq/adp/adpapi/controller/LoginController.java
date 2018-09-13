package com.zhanqq.adp.adpapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {


        //权限
//        if(ShiroKit.isAuthenticated() || ShiroKit.getUser() != null){
//
//            return  REDIRECT + "/";
//        }

        return "login";
    }


}
