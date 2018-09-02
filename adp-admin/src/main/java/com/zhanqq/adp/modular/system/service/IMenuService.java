package com.zhanqq.adp.modular.system.service;

import com.zhanqq.adp.core.node.MenuNode;
import com.zhanqq.adp.modular.system.model.Menu;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 菜单表 服务类
 * </p>
 *
 * @author zhanqq
 * @since 2018-08-30
 */
public interface IMenuService extends IService<Menu> {

   public List<MenuNode> getMenusByRoleIds(List<Integer> roleIds);
}
