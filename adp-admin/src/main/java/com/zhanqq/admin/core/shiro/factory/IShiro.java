/*
package com.zhanqq.admin.core.shiro.factory;

import org.apache.shiro.authc.SimpleAuthenticationInfo;

import java.util.List;

*/
/**
 * @ClassName IShiro
 * @Description  定义shirorealm所需数据的接口
 * @Author zhanqq
 * @Date 2018/8/2310:06
 * @Version 1.0
 **//*

public interface IShiro {
    */
/**
     * 根据账号获取登录用户
     *
     * @param account 账号
     *//*

    User user(String account);

    */
/**
     * 根据系统用户获取Shiro的用户
     *
     * @param user 系统用户
     *//*

    ShiroUser shiroUser(User user);

    */
/**
     * 获取权限列表通过角色id
     *
     * @param roleId 角色id
     *//*

    List<String> findPermissionsByRoleId(Integer roleId);

    */
/**
     * 根据角色id获取角色名称
     *
     * @param roleId 角色id
     *//*

    String findRoleNameByRoleId(Integer roleId);

    */
/**
     * 获取shiro的认证信息
     *//*

    SimpleAuthenticationInfo info(ShiroUser shiroUser, User user, String realmName);

}
*/
