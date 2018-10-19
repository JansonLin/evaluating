package com.evaluating.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @author Administrator
 * @do 用户的登录注册以及修改密码页面的跳转和信息的提交
 */
@Controller
public class LoginController {
	@RequestMapping("toLogin")
	public String toLoginPage() {
		System.out.println("");
		return "login";
	}
}
