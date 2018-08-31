package com.zhanqq.adp.modular.system.service.impl;

import com.zhanqq.adp.modular.system.model.Dept;
import com.zhanqq.adp.modular.system.dao.DeptMapper;
import com.zhanqq.adp.modular.system.service.IDeptService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author zhanqq
 * @since 2018-08-30
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
