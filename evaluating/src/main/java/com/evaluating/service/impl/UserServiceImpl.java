package com.evaluating.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluating.mapper.UserMapper;
import com.evaluating.model.User;
import com.evaluating.service.UserService;
@Service("userSercvice")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper mapper;
	
	public User getUser() {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(1);
	}

}
