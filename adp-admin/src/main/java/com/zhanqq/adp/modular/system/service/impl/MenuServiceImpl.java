package com.zhanqq.adp.modular.system.service.impl;

import com.zhanqq.adp.core.node.MenuNode;
import com.zhanqq.adp.modular.system.model.Menu;
import com.zhanqq.adp.modular.system.dao.MenuMapper;
import com.zhanqq.adp.modular.system.service.IMenuService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author zhanqq
 * @since 2018-08-30
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

    private MenuMapper menuMapper;

    @Override
    public List<MenuNode> getMenusByRoleIds(List<Integer> roleIds) {

        return this.baseMapper.getMenusByRoleIds(roleIds);

    }


}
