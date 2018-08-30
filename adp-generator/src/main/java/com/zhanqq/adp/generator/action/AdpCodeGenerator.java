package com.zhanqq.adp.generator.action;

import com.zhanqq.adp.generator.action.config.AbstractGeneratorConfig;
import com.zhanqq.adp.generator.action.config.AdpGeneratorConfig;

/**
 * @ClassName AdpCodeGenerator
 * @Description 代码生成器,可以生成实体,dao,service,controller,html,js
 * @Author zhanqq
 * @Date 2018/8/2411:11
 * @Version 1.0
 **/
public class AdpCodeGenerator {

    /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {

        AbstractGeneratorConfig config = new AdpGeneratorConfig();
        config.doMpGeneration();

//        config.doAdpGeneration();


    }
}
