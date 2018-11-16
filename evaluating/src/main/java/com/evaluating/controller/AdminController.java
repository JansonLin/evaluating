package com.evaluating.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/**
 * 
 * @author Administrator
 * @do 系统管理Controller，关于权限，用户管理，等超级管理员的功能均放在这个页面
 */
@RequestMapping("admin")
public class AdminController {
	
	@RequestMapping("toMain")
	public String toMainPage() {
		return "index";
	}
	
	@RequestMapping("toAddUser")
	public String toAddUser() {
		return "admin/addUser";
	}
	@RequestMapping("toAddRole")
	public String toAddRole() {
		return "admin/addRole";
	}
}
