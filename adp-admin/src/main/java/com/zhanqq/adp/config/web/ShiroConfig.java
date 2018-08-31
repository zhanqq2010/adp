package com.zhanqq.adp.config.web;


import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @ClassName ShiroConfig
 * @Description TODO
 * @Author zhanqq
 * @Date 2018/8/2117:20
 * @Version 1.0
 **/
@Configuration
public class ShiroConfig {


    /**
     * 注入 securityManager
     */
    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        // 设置realm.
//        securityManager.setRealm(customRealm());
        return securityManager;
    }
}
