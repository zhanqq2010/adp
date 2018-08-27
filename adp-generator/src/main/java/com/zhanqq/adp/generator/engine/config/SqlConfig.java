package com.zhanqq.adp.generator.engine.config;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class SqlConfig {

    private String sqlPathTemplate;

    private ContextConfig contextConfig;

    private Connection connection;

    private String parentMenuName;

    private List<Menu> menus = new ArrayList<>(6);

    public String getSqlPathTemplate() {
        return sqlPathTemplate;
    }

    public void setSqlPathTemplate(String sqlPathTemplate) {
        this.sqlPathTemplate = sqlPathTemplate;
    }

    public ContextConfig getContextConfig() {
        return contextConfig;
    }

    public void setContextConfig(ContextConfig contextConfig) {
        this.contextConfig = contextConfig;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public String getParentMenuName() {
        return parentMenuName;
    }

    public void setParentMenuName(String parentMenuName) {
        this.parentMenuName = parentMenuName;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
}
