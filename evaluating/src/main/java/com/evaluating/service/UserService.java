package com.evaluating.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluating.mapper.UserMapper;
import com.evaluating.model.User;
import com.evaluating.model.UserExample;
import com.evaluating.model.UserExample.Criteria;
@Service("userSercvice")
public class UserService {
	@Autowired
	private UserMapper mapper;
	
	public User getUser() {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(1);
	}
	
	public int saveUser(User user) {
		int insert = mapper.insertSelective(user);
		return insert;
	}
	/**
	 * 判断是否存在用户，0不存在，1存在
	 */
	public int hasUser(User user) {
		int result= 0;
		UserExample example = new UserExample();
		Criteria criteria1 = example.createCriteria();
		Criteria criteria2 = example.createCriteria();
		Criteria criteria3 = example.createCriteria();
		if(user.getuName()!=null&&!"".equals(user.getuName())) {
			criteria1.andUNameEqualTo(user.getuName());
		}
		if(user.getuEmail()!=null&&!"".equals(user.getuEmail())) {
			criteria2.andUEmailEqualTo(user.getuEmail());
		}
		if(user.getuPhone()!=null&&!"".equals(user.getuPhone())) {
			criteria3.andUPhoneEqualTo(user.getuPhone());
		}
		example.or(criteria2);
		example.or(criteria3);
		List<User> selectByExample = mapper.selectByExample(example);
		if(selectByExample.size()!=0) {
			result=1;
		}
		return result;
	}
}
