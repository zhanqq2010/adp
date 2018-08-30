package com.zhanqq.adp.admin.core.log;

import com.zhanqq.adp.core.util.SpringContextHolder;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * @ClassName LogObjectHolder
 * @Description TODO
 * @Author zhanqq
 * @Date 2018/8/3017:57
 * @Version 1.0
 **/

@Component
@Scope(scopeName = WebApplicationContext.SCOPE_SESSION)
public class LogObjectHolder {

    private Object object = null;

    public void set(Object obj) {
        this.object = obj;
    }

    public Object get() {
        return object;
    }

    public static LogObjectHolder me(){
        LogObjectHolder bean = SpringContextHolder.getBean(LogObjectHolder.class);
        return bean;
    }
}
