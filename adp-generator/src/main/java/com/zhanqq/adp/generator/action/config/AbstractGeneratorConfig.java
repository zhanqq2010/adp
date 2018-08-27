package com.zhanqq.adp.generator.action.config;


import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.zhanqq.adp.core.util.FileUtil;
import com.zhanqq.adp.generator.engine.config.ContextConfig;
import com.zhanqq.adp.generator.engine.config.SqlConfig;

import java.io.File;

/**
 * @ClassName AbstractGeneratorConfig
 * @Description TODO
 * @Author zhanqq
 * @Date 2018/8/2710:25
 * @Version 1.0
 **/
public abstract class AbstractGeneratorConfig {

    AutoGenerator autoGenerator = new AutoGenerator();
    // 全局配置
    GlobalConfig globalConfig = new GlobalConfig();
    // 数据源配置
    DataSourceConfig dataSourceConfig = new DataSourceConfig();
    // 策略配置
    StrategyConfig strategyConfig = new StrategyConfig();
    // 包配置
    PackageConfig packageConfig = new PackageConfig();
    //adp代码生成器配置
    ContextConfig contextConfig = new ContextConfig();

    SqlConfig sqlConfig = new SqlConfig();

    public void doMpGeneration() {
        init();
        autoGenerator.setGlobalConfig(globalConfig);
        autoGenerator.setDataSource(dataSourceConfig);
        autoGenerator.setStrategy(strategyConfig);
        autoGenerator.setPackageInfo(packageConfig);
        autoGenerator.execute();
        destory();
    }

    /**
     * 删除不必要的代码
     */
    private void destory() {
        String outputDir = globalConfig.getOutputDir() + "/TTT";
        FileUtil.deleteDir(new File(outputDir));
    }


    public void init() {
        config();
        packageConfig.setService(contextConfig.getProPackage() +  ".modular." + contextConfig.getModuleName() + ".service");
        packageConfig.setServiceImpl(contextConfig.getProPackage() + ".modular." + contextConfig.getModuleName() + ".service.impl");
        //controller没用掉,生成之后会自动删掉
        packageConfig.setController("TTT");


        if (!contextConfig.getEntitySwitch()) {
            packageConfig.setEntity("TTT");
        }

        if (!contextConfig.getDaoSwitch()) {
            packageConfig.setMapper("TTT");
            packageConfig.setXml("TTT");
        }

        if (!contextConfig.getServiceSwitch()) {
            packageConfig.setService("TTT");
            packageConfig.setServiceImpl("TTT");
        }

    }

    protected abstract void config();

    public abstract void doAdpGeneration();
}
