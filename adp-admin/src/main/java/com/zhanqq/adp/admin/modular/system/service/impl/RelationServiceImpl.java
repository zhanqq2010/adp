package com.zhanqq.adp.admin.modular.system.service.impl;

import com.zhanqq.adp.admin.modular.system.model.Relation;
import com.zhanqq.adp.admin.modular.system.dao.RelationMapper;
import com.zhanqq.adp.admin.modular.system.service.IRelationService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色和菜单关联表 服务实现类
 * </p>
 *
 * @author zhanqq
 * @since 2018-08-30
 */
@Service
public class RelationServiceImpl extends ServiceImpl<RelationMapper, Relation> implements IRelationService {

}
