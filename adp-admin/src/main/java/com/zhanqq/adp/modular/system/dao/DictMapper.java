package com.zhanqq.adp.modular.system.dao;

import com.zhanqq.adp.modular.system.model.Dict;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 字典表 Mapper 接口
 * </p>
 *
 * @author zhanqq
 * @since 2018-08-30
 */
public interface DictMapper extends BaseMapper<Dict> {
    /**
     * 根据父类编码获取词典列表
     */
    List<Dict> selectByParentCode(@Param("code") String code);

}
