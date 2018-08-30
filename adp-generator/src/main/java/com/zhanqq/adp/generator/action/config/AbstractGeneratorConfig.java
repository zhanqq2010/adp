package com.zhanqq.adp.generator.action.config;


import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.zhanqq.adp.core.util.FileUtil;
import com.zhanqq.adp.generator.engine.SimpleTemplateEngine;
import com.zhanqq.adp.generator.engine.base.AbstractTemplateEngine;
import com.zhanqq.adp.generator.engine.config.ContextConfig;
import com.zhanqq.adp.generator.engine.config.SqlConfig;

import java.io.File;
import java.util.List;

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

    TableInfo tableInfo = null;

    public void doMpGeneration() {
        init();
        autoGenerator.setGlobalConfig(globalConfig);
        autoGenerator.setDataSource(dataSourceConfig);
        autoGenerator.setStrategy(strategyConfig);
        autoGenerator.setPackageInfo(packageConfig);
        autoGenerator.execute();
        destory();

        //获取table信息,用于guns代码生成
        List<TableInfo> tableInfoList = autoGenerator.getConfig().getTableInfoList();
        if(tableInfoList != null && tableInfoList.size() >  0){
            this.tableInfo = tableInfoList.get(0);
        }
    }

    /**
     * 删除不必要的代码
     */
    private void destory() {
        String outputDir = globalConfig.getOutputDir() + "/QQQ";
        FileUtil.deleteDir(new File(outputDir));
    }


    public void init() {
        config();
        packageConfig.setService(contextConfig.getProPackage() +  ".modular." + contextConfig.getModuleName() + ".service");
        packageConfig.setServiceImpl(contextConfig.getProPackage() + ".modular." + contextConfig.getModuleName() + ".service.impl");
        //controller没用掉,生成之后会自动删掉
        packageConfig.setController("QQQ");


        if (!contextConfig.getEntitySwitch()) {
            packageConfig.setEntity("QQQ");
        }

        if (!contextConfig.getDaoSwitch()) {
            packageConfig.setMapper("QQQ");
            packageConfig.setXml("QQQ");
        }

        if (!contextConfig.getServiceSwitch()) {
            packageConfig.setService("QQQ");
            packageConfig.setServiceImpl("QQQ");
        }

    }

    protected abstract void config();

    public void doAdpGeneration() {
        AbstractTemplateEngine engine = new SimpleTemplateEngine();
        engine.setContextConfig(contextConfig);
        sqlConfig.setConnection(dataSourceConfig.getConn());
        engine.setSqlConfig(sqlConfig);
        engine.setTableInfo(tableInfo);
        engine.start();
    }
}
