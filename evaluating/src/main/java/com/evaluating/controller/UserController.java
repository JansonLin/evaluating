package com.evaluating.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.evaluating.model.User;
import com.evaluating.service.UserService;
@Controller
/**
 * 
 * 普通用户可用的后端部分controller
 */
@RequestMapping(value ="user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("toMain")
	public String toMainPage() {
		return "admin/main";
	}
	
	
	/**
	 * 个人中心
	 */
	@RequestMapping(value="personal")
	public ModelAndView personal(HttpServletRequest req,HttpServletResponse rep) {
		HttpSession session = req.getSession();
		ModelAndView model = new ModelAndView();
		model.setViewName("admin/main");
		return model;
	}
	/**
	 * 修改用户信息
	 */
	/**
	 * 密码页
	 */
	@RequestMapping(value="toPassword")
	public String toPassword() {
		return "admin/user/user_password";
	}
	/**
	 * 修改密码
	 */
	/*
	 * 查看我的考试
	 */
	@RequestMapping(value="toExam")
	public ModelAndView toExam(HttpServletRequest req,HttpServletResponse rep) {
		HttpSession session = req.getSession();
		ModelAndView model = new ModelAndView();
		model.setViewName("admin/user/exam");
		return model;
	}
}
