package com.zhanqq.adp.modular.system.dao;

import com.zhanqq.adp.core.node.MenuNode;
import com.zhanqq.adp.modular.system.model.Menu;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 菜单表 Mapper 接口
 * </p>
 *
 * @author zhanqq
 * @since 2018-08-30
 */
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     * 根据条件查询菜单
     *
     * @return
     * @date 2017年2月12日 下午9:14:34
     */
    List<MenuNode> getMenusByRoleIds(List<Integer> roleIds);

}
