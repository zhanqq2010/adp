package com.zhanqq.admin.core.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @ClassName ShiroDbRealm
 * @Description 自定义Realm
 * @Author zhanqq
 * @Date 2018/8/239:58
 * @Version 1.0
 **/
public class ShiroDbRealm extends AuthorizingRealm {

    /** 
     * 
     * 功能描述
     * @Author zhanqq
     * @Description 权限认证
     * @Date 10:00 2018/8/23
     * @Param
     * @return 
    **/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    
    /** 
     * 
     * 功能描述
     * @Author zhanqq
     * @Description  登录认证
     * @Date 10:00 2018/8/23
     * @Param
     * @return 
    **/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}
