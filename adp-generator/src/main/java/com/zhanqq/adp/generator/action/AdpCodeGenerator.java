package com.zhanqq.adp.generator.action;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.zhanqq.adp.generator.action.config.AbstractGeneratorConfig;
import com.zhanqq.adp.generator.action.config.AdpGeneratorConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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




    }
}
