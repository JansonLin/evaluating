package com.evaluating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.evaluating.model.User;
import com.evaluating.service.UserService;
@Controller
@RequestMapping(value ="admin")
public class UserController {
	@Autowired
	private UserService userService;
	@ResponseBody
	@RequestMapping(value ="user")
	public User getUser() {
		User user =  userService.getUser();
		return user;
	}
}
