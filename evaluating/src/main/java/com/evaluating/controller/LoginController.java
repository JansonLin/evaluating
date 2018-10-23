package com.evaluating.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.evaluating.model.User;
/**
 * 
 * @author Administrator
 * @do 用户的登录注册以及修改密码页面的跳转和信息的提交
 */
@Controller
public class LoginController {
	@RequestMapping("toLogin")
	public String toLoginPage() {
		return "login";
	}
	@RequestMapping("toRegister")
	public String toRegister() {
		return "register";
	}
	/**
	 * 注册用户（所有的注册用户均为最基本的用户，即生成用户只有考试功能，超级管理员，管理员和审核员均为后台添加）
	 */
	@RequestMapping("register")
	public String register(User user) {
		String name = user.getuName();
		String password = user.getuPassword();
		System.out.println(name);
		System.out.println(password);
		return null;
	}
	
}
