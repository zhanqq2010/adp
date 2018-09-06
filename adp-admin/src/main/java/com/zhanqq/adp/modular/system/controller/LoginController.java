package com.zhanqq.adp.modular.system.controller;

import com.zhanqq.adp.core.base.controller.BaseController;
import com.zhanqq.adp.core.node.MenuNode;
import com.zhanqq.adp.core.shiro.ShiroKit;
import com.zhanqq.adp.core.util.ApiMenuFilter;
import com.zhanqq.adp.modular.system.model.User;
import com.zhanqq.adp.modular.system.service.IMenuService;
import com.zhanqq.adp.modular.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class LoginController extends BaseController {

    @Autowired
    private IMenuService menuService;

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        //权限
        if(ShiroKit.isAuthenticated() || ShiroKit.getUser() != null){
            return  REDIRECT + "/";
        }

        return "/login.html";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {

        //获取菜单列表
        List<Integer> roleList = ShiroKit.getUser().getRoleList();
        if (roleList == null || roleList.size() == 0) {
            ShiroKit.getSubject().logout();
            model.addAttribute("tips", "该用户没有角色，无法登陆");
            return "login.html";
        }
        List<MenuNode> menus = menuService.getMenusByRoleIds(roleList);
        List<MenuNode> titles = MenuNode.buildTitle(menus);
        titles = ApiMenuFilter.build(titles);
        model.addAttribute("titles", titles);

        //获取用户头像
        Integer id = ShiroKit.getUser().getId();
        User user = userService.selectById(id);
        String avatar = user.getAvatar();
        model.addAttribute("avatar", avatar);

        return "index.html";

    }
}
