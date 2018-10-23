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
@RequestMapping(value ="user")
public class UserController {
	@Autowired
	private UserService userService;
	@ResponseBody
	@RequestMapping(value ="user")
	public User getUser() {
		User user =  userService.getUser();
		return user;
	}
	/**
	 * 个人中心
	 */
	@RequestMapping(value="personal")
	public ModelAndView personal(HttpServletRequest req,HttpServletResponse rep) {
		HttpSession session = req.getSession();
		ModelAndView model = new ModelAndView();
		model.setViewName("admin/info/user_info");
		return model;
	}
	/**
	 * 修改用户信息
	 */
	/*
	 * 查
	 */
}
