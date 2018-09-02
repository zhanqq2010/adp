package com.zhanqq.adp.core.util;

import com.zhanqq.adp.config.properties.AdpProperties;
import com.zhanqq.adp.core.common.constant.Const;
import com.zhanqq.adp.core.node.MenuNode;

import java.util.ArrayList;
import java.util.List;

/**
 * api接口文档显示过滤
 */
public class ApiMenuFilter extends MenuNode {
    public static List<MenuNode> build(List<MenuNode> nodes){
        //如果关闭了接口文档,则不显示接口文档菜单
        AdpProperties adpProperties = SpringContextHolder.getBean(AdpProperties.class);
        if(!adpProperties.getSwaggerOpen()){
            List<MenuNode> menuNodesCopy = new ArrayList<>();
            for(MenuNode menuNode : nodes){
                if(Const.API_MENU_NAME.equals(menuNode)){
                    continue;
                }else{
                    menuNodesCopy.add(menuNode);
                }
            }
            nodes = menuNodesCopy;
        }

        return nodes;
    }
}
