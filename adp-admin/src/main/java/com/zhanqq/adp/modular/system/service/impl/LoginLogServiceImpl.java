package com.zhanqq.adp.modular.system.service.impl;

import com.zhanqq.adp.modular.system.model.LoginLog;
import com.zhanqq.adp.modular.system.dao.LoginLogMapper;
import com.zhanqq.adp.modular.system.service.ILoginLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录记录 服务实现类
 * </p>
 *
 * @author zhanqq
 * @since 2018-08-30
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements ILoginLogService {

}
