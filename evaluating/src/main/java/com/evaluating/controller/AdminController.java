package com.evaluating.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.evaluating.model.Role;
import com.evaluating.model.User;
import com.evaluating.model.require.ResultBean;
import com.evaluating.service.RoleService;

@Controller
/**
 * 
 * @author Administrator
 * @do 系统管理Controller，关于权限，用户管理，等超级管理员的功能均放在这个页面
 */
@RequestMapping("admin")
public class AdminController {
	@Autowired
	private RoleService roleService;
	
	
	
	@RequestMapping("toAddUser")
	public String toAddUser() {
		Subject subject = SecurityUtils.getSubject();
		Object principal = subject.getPrincipal();
		System.out.println(principal.toString());
		return "admin/addUser";
	}
	@RequestMapping("toAddRole")
	public String toAddRole() {
		return "admin/addRole";
	}
	
	/**
	 * 添加用户，并返回添加状态
	 * @return
	 */
	@RequestMapping("addRole")
	@ResponseBody
	public ResultBean addRole(Role role) {
		ResultBean result = new ResultBean();
		roleService.saveRole(role);
		result.setMsg("角色添加成功");
		return result;
	}
}
