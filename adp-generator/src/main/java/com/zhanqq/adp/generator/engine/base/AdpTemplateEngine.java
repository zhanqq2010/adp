package com.zhanqq.adp.generator.engine.base;

import com.sun.javafx.PlatformUtil;
import com.zhanqq.adp.core.util.ToolUtil;
import com.zhanqq.adp.generator.engine.config.*;
import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.ClasspathResourceLoader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class AdpTemplateEngine extends AbstractTemplateEngine{
    private GroupTemplate groupTemplate;

    public AdpTemplateEngine(){
        initBeetlEngine();
    }

    protected void initBeetlEngine() {
        Properties properties = new Properties();
        properties.put("RESOURCE.root", "");
        properties.put("DELIMITER_STATEMENT_START", "<%");
        properties.put("DELIMITER_STATEMENT_END", "%>");
        properties.put("HTML_TAG_FLAG", "##");
        Configuration cfg = null;
        try {
            cfg = new Configuration(properties);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ClasspathResourceLoader resourceLoader = new ClasspathResourceLoader();
        groupTemplate = new GroupTemplate(resourceLoader, cfg);
        groupTemplate.registerFunctionPackage("tool", new ToolUtil());
    }

    protected void initConfig() {
        if (this.contextConfig == null) {
            this.contextConfig = new ContextConfig();
        }
        if (this.controllerConfig == null) {
            this.controllerConfig = new ControllerConfig();
        }
        if (this.pageConfig == null) {
            this.pageConfig = new PageConfig();
        }
        if (this.daoConfig == null) {
            this.daoConfig = new DaoConfig();
        }
        if (this.serviceConfig == null) {
            this.serviceConfig = new ServiceConfig();
        }
        if (this.sqlConfig == null) {
            this.sqlConfig = new SqlConfig();
        }

        this.contextConfig.init();

        this.controllerConfig.setContextConfig(this.contextConfig);
        this.controllerConfig.init();

        this.serviceConfig.setContextConfig(this.contextConfig);
        this.serviceConfig.init();

        this.daoConfig.setContextConfig(this.contextConfig);
        this.daoConfig.init();

        this.pageConfig.setContextConfig(this.contextConfig);
        this.pageConfig.init();

        this.sqlConfig.setContextConfig(this.contextConfig);
        this.sqlConfig.init();
    }

    public void start(){
        //配置之间的相互依赖
        initConfig();

        //生成模板
        if (super.contextConfig.getControllerSwitch()) {
            generateController();
        }
        if (super.contextConfig.getIndexPageSwitch()) {
            generatePageHtml();
        }
        if (super.contextConfig.getAddPageSwitch()) {
            generatePageAddHtml();
        }
        if (super.contextConfig.getEditPageSwitch()) {
            generatePageEditHtml();
        }
        if (super.contextConfig.getJsSwitch()) {
            generatePageJs();
        }
        if (super.contextConfig.getInfoJsSwitch()) {
            generatePageInfoJs();
        }
        if (super.contextConfig.getSqlSwitch()) {
            generateSqls();
        }
    }


    protected void generateFile(String template, String filePath) {
        Template pageTemplate = groupTemplate.getTemplate(template);
        configTemplate(pageTemplate);
        if (PlatformUtil.isWindows()) {
            filePath = filePath.replaceAll("/+|\\\\+", "\\\\");
        } else {
            filePath = filePath.replaceAll("/+|\\\\+", "/");
        }
        File file = new File(filePath);
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            pageTemplate.renderTo(fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected void configTemplate(Template template) {
        template.binding("controller", super.controllerConfig);
        template.binding("context", super.contextConfig);
        template.binding("dao", super.daoConfig);
        template.binding("service", super.serviceConfig);
        template.binding("sqls", super.sqlConfig);
        template.binding("table", super.tableInfo);
    }
}
