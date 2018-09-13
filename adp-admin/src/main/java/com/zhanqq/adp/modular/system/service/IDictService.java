package com.zhanqq.adp.modular.system.service;

import com.zhanqq.adp.modular.system.model.Dict;
import com.baomidou.mybatisplus.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 字典表 服务类
 * </p>
 *
 * @author zhanqq
 * @since 2018-08-30
 */
public interface IDictService extends IService<Dict> {
    /**
     * 根据父类编码获取词典列表
     */
    List<Dict> selectByParentCode(@Param("code") String code);

}
