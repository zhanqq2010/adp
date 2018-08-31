package com.zhanqq.adp.modular.system.service.impl;

import com.zhanqq.adp.modular.system.model.Expense;
import com.zhanqq.adp.modular.system.dao.ExpenseMapper;
import com.zhanqq.adp.modular.system.service.IExpenseService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 报销表 服务实现类
 * </p>
 *
 * @author zhanqq
 * @since 2018-08-30
 */
@Service
public class ExpenseServiceImpl extends ServiceImpl<ExpenseMapper, Expense> implements IExpenseService {

}
