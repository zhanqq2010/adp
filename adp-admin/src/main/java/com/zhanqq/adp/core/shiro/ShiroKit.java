package com.zhanqq.adp.core.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import javax.servlet.ServletRequest;

/**
 *
 */
public class ShiroKit {


    public static ShiroUser getUser() {
        if (isGuest()) {
            return null;
        }
        return (ShiroUser) getSubject().getPrincipals().getPrimaryPrincipal();
    }

    /**
     * 验证当前用户是否为“访客”，即未认证（包含未记住）的用户。用user搭配使用
     * @return
     */
    public static  boolean isGuest() {
        return !isUser();
    }

    /**
     * 认证通过或已记住的用户。与guset搭配使用。
     * @return
     */
    public static boolean isUser() {
        return getSubject() != null && getSubject().getPrincipal() != null;
    }

    /**
     *  获取当前Subject
     * @return
     */
    public static Subject getSubject() {
        return SecurityUtils.getSubject();
    }

    /**
     * 从shiro获取session
     *
     */

    public static Session getSession() {
        return getSubject().getSession();
    }

    /**
     * 已认证通过的用户。不包含已记住的用户，这是与user标签的区别所在。与notAuthenticated搭配使用
     * @return
     */
    public static boolean isAuthenticated() {
        return getSubject() != null && getSubject().isAuthenticated();
    }
}
