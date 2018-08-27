package com.zhanqq.adp.generator.engine.base;

import com.zhanqq.adp.generator.engine.config.*;

public abstract class AdpTemplateEngine extends AbstractTemplateEngine{
    protected void initConfig() {
        if (this.mContextConfig == null) {
            this.mContextConfig = new ContextConfig();
        }
        if (this.mControllerConfig == null) {
            this.mControllerConfig = new ControllerConfig();
        }
        if (this.mPageConfig == null) {
            this.mPageConfig = new PageConfig();
        }
        if (this.mDaoConfig == null) {
            this.mDaoConfig = new DaoConfig();
        }
        if (this.mServiceConfig == null) {
            this.mServiceConfig = new ServiceConfig();
        }
        if (this.mSqlConfig == null) {
            this.mSqlConfig = new SqlConfig();
        }

        this.mContextConfig.init();
    }
}
