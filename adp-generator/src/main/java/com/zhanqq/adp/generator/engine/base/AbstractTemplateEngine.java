package com.zhanqq.adp.generator.engine.base;

import com.zhanqq.adp.generator.engine.config.*;

public abstract class AbstractTemplateEngine {

    protected ControllerConfig mControllerConfig;
    protected ContextConfig mContextConfig;
    protected DaoConfig mDaoConfig;
    protected PageConfig mPageConfig;
    protected ServiceConfig mServiceConfig;
    protected SqlConfig mSqlConfig;
    protected TableInfo mTableInfo;


    protected abstract void initConfig();
}
