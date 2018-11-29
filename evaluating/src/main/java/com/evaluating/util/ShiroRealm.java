package com.evaluating.util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.evaluating.model.Role;
import com.evaluating.model.User;
import com.evaluating.service.RoleService;
import com.evaluating.service.UserService;

public class ShiroRealm extends AuthorizingRealm {
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	/**
	 * 登录认证
	 */
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String userName = (String)token.getPrincipal();
		String password = new String((char[])token.getCredentials());
		User user = userService.getUser(userName, password);
		if(user!=null) {
			 //如果身份认证验证成功，返回一个AuthenticationInfo实现；  
	        return new SimpleAuthenticationInfo(user.getuName(), user.getuPassword(), getName());  
		}
		throw new UnknownAccountException("用户名或密码错误");
	}
	/**
	 * 权限认证
	 */
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String userName= (String)SecurityUtils.getSubject().getPrincipal();
		User user = userService.getUserByName(userName);
		SimpleAuthorizationInfo simpleAuthorizationInfo =new SimpleAuthorizationInfo();
		simpleAuthorizationInfo.setRoles(this.getRolesByUser(user));
		
		return simpleAuthorizationInfo;
	}
	
	/**
	 * 根据用户获取权限编码字符集
	 * @param user
	 * @return
	 */
	private Set<String> getRolesByUser(User user){
		
		List<Role> role = roleService.getRolesByUser(user);
		Set<String> roles = new HashSet<String>();
		for (Role role2 : role) {
			roles.add(role2.getrCode());
		}
		return roles;
	}

}
