package com.zhanqq.adp.admin.modular.system.service.impl;

import com.zhanqq.adp.admin.modular.system.model.OperationLog;
import com.zhanqq.adp.admin.modular.system.dao.OperationLogMapper;
import com.zhanqq.adp.admin.modular.system.service.IOperationLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志 服务实现类
 * </p>
 *
 * @author zhanqq
 * @since 2018-08-30
 */
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog> implements IOperationLogService {

}
