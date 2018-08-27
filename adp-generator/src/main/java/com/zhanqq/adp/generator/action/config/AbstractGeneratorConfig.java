package com.zhanqq.adp.generator.action.config;


import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.zhanqq.adp.generator.engine.config.ContextConfig;

/**
 * @ClassName AbstractGeneratorConfig
 * @Description TODO
 * @Author zhanqq
 * @Date 2018/8/2710:25
 * @Version 1.0
 **/
public abstract class AbstractGeneratorConfig {

    AutoGenerator mAutoGenerator = new AutoGenerator();
    // 全局配置
    GlobalConfig mGlobalConfig = new GlobalConfig();
    // 数据源配置
    DataSourceConfig mDataSourceConfig = new DataSourceConfig();
    // 策略配置
    StrategyConfig mStrategyConfig = new StrategyConfig();
    // 包配置
    PackageConfig mPackageConfig = new PackageConfig();
    //adp代码生成器配置
    ContextConfig contextConfig = new ContextConfig();

    public void doMpGeneration() {
        init();
    }



    public void init() {
        config();
        mAutoGenerator.setGlobalConfig(mGlobalConfig);
        mAutoGenerator.setDataSource(mDataSourceConfig);
        mAutoGenerator.setStrategy(mStrategyConfig);

    }

    protected abstract void config();
}
