package com.zhanqq.adp.modular.system.service.impl;

import com.zhanqq.adp.modular.system.model.User;
import com.zhanqq.adp.modular.system.dao.UserMapper;
import com.zhanqq.adp.modular.system.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author zhanqq
 * @since 2018-08-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
