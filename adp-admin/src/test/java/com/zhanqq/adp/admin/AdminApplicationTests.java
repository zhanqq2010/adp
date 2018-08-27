package com.zhanqq.adp.admin;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.SimpleAccount;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.lang.model.element.VariableElement;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminApplicationTests {

	SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();

	@Test
	public void contextLoads() {
	}

	@Before
	public void addUser(){
		simpleAccountRealm.addAccount("zhanqq", "123456", "admin");
	}

	@Test
	public void testAuthentication(){

		//1.构建SecurityManager环境
		DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
		defaultSecurityManager.setRealm(simpleAccountRealm);
		//2. 主题提交认证请求
		SecurityUtils.setSecurityManager(defaultSecurityManager);
		Subject subject = SecurityUtils.getSubject();


		UsernamePasswordToken token = new UsernamePasswordToken("zhanqq", "123456");
		subject.login(token);

		System.out.println("isAuthenticated = " + subject.isAuthenticated());
		//3.

		subject.checkRole("admin");
	}

}