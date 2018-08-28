package com.zhanqq.adp.generator.action.config;

import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @ClassName AdpGeneratorConfig
 * @Description TODO
 * @Author zhanqq
 * @Date 2018/8/2710:26
 * @Version 1.0
 **/
public class AdpGeneratorConfig extends AbstractGeneratorConfig {
    @Override
    protected void config() {
        globalConfig();
        dataSourceConfig();
        strategyConfig();
        packageConfig();
        contextConfig();
    }



    /** 
     * 
     * 功能描述
     * @Author zhanqq
     * @Description 全局配置
     * @Date 10:36 2018/8/27
     * @Param
     * @return 
    **/
    protected void globalConfig() {
        globalConfig.setOutputDir("D://QQQ");
        globalConfig.setFileOverride(true);
        globalConfig.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        globalConfig.setEnableCache(false);// XML 二级缓存
        globalConfig.setBaseResultMap(true);// XML ResultMap
        globalConfig.setBaseColumnList(false);// XML columList
        // .setKotlin(true) 是否生成 kotlin 代码
        globalConfig.setAuthor("zhanqq");

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        // gc.setMapperName("%sDao");
        // gc.setXmlName("%sDao");
        // gc.setServiceName("MP%sService");
        // gc.setServiceImplName("%sServiceDiy");
        // gc.setControllerName("%sAction");

    }

    /** 
     * 
     * 功能描述
     * @Author zhanqq
     * @Description  数据源配置
     * @Date 10:38 2018/8/27
     * @Param
     * @return 
    **/
    protected void dataSourceConfig() {
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setTypeConvert(new MySqlTypeConvert(){
            // 自定义数据库表字段类型转换【可选】
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                System.out.println("转换类型：" + fieldType);
                // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
                return super.processTypeConvert(fieldType);
            }
        });


        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("123456");
        dataSourceConfig.setUrl("jdbc:mysql://127.0.0.1:3306/adp?characterEncoding=utf8&serverTimezone=GMT%2B8");

    }

    /** 
     * 
     * 功能描述
     * @Author zhanqq
     * @Description //TODO 
     * @Date 10:39 2018/8/27
     * @Param
     * @return 
    **/
    protected void strategyConfig() {
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        strategyConfig.setTablePrefix(new String[] {  "sys_" });// 此处可以修改为您的表前缀
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        // strategy.setInclude(new String[] { "user" }); // 需要生成的表
        // strategy.setExclude(new String[]{"test"}); // 排除生成的表
        // 自定义实体父类
        // strategy.setSuperEntityClass("com.baomidou.demo.TestEntity");
        // 自定义实体，公共字段
        // strategy.setSuperEntityColumns(new String[] { "test_id", "age" });
        // 自定义 mapper 父类
        // strategy.setSuperMapperClass("com.baomidou.demo.TestMapper");
        // 自定义 service 父类
        // strategy.setSuperServiceClass("com.baomidou.demo.TestService");
        // 自定义 service 实现类父类
        // strategy.setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl");
        // 自定义 controller 父类
        // strategy.setSuperControllerClass("com.baomidou.demo.TestController");
        // 【实体】是否生成字段常量（默认 false）
        // public static final String ID = "test_id";
        // strategy.setEntityColumnConstant(true);
        // 【实体】是否为构建者模型（默认 false）
        // public User setName(String name) {this.name = name; return this;}
        // strategy.setEntityBuilderModel(true);


    }

    protected void packageConfig() {
        packageConfig.setParent(null);
        packageConfig.setEntity("com.zhanqq.adp.admin.modular.system.model");
        packageConfig.setMapper("com.zhanqq.adp.admin.modular.system.dao");
        packageConfig.setXml("com.zhanqq.adp.admin.modular.system.dao.mapping");

    }

    protected void contextConfig() {
        contextConfig.setProPackage("com.zhanqq.adp.admin");
        contextConfig.setCoreBasePackage("com.zhanqq.adp.core");
        contextConfig.setBizChName("字典管理");
        contextConfig.setBizEnBigName("sysDict");
        contextConfig.setModuleName("system");
        contextConfig.setProjectPath("D:\\WorkSp\\javaWeb\\adp\\adp-admin");
        contextConfig.setEntityName("SysDict");

        sqlConfig.setParentMenuName(null);//这里写已有菜单的名称,当做父节点

        //mybatis-plus 生成器开关
        contextConfig.setEntitySwitch(true);
        contextConfig.setDaoSwitch(true);
        contextConfig.setServiceSwitch(true);

        //adp 生成器开关
        contextConfig.setControllerSwitch(true);
        contextConfig.setIndexPageSwitch(true);
        contextConfig.setAddPageSwitch(true);
        contextConfig.setEditPageSwitch(true);
        contextConfig.setJsSwitch(true);
        contextConfig.setInfoJsSwitch(true);
        contextConfig.setSqlSwitch(true);

    }




    @Override
    public void doAdpGeneration() {
//        AbstractTemplateEngine engine = new AdpGeneratorConfig();

    }
}
