package com.evaluating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.evaluating.model.User;
import com.evaluating.service.UserService;
/**
 * 
 * @author Administrator
 * @do 用户的登录注册以及修改密码页面的跳转和信息的提交
 */
@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	
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
	public ModelAndView register(User user) {
		int hasUser=1;
		int saveUser=0;
		ModelAndView model = new ModelAndView();
		hasUser = userService.hasUser(user);
		if(hasUser==0) {
			saveUser = userService.saveUser(user);
		}
		if(saveUser==1) {
			model.addObject("message", "注册成功");
			model.setViewName("admin/user/toMain");
		}else {
			model.addObject("message", "注册失败");
			model.setViewName("register");
		}
		return model;
	}
	
}
