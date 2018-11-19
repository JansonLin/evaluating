package com.evaluating.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluating.mapper.RoleMapper;
import com.evaluating.model.Role;
import com.evaluating.model.RoleExample;
import com.evaluating.model.RoleExample.Criteria;
import com.evaluating.model.User;
@Service("roleService")
public class RoleService {
	@Autowired
	private RoleMapper roleMapper;
	
	public List<Role> getRolesByUser(){
		return null;
	}
	
	public void saveRole(Role role) {
		roleMapper.insert(role);
	}
	
	public List<Role> getRolesByUser(User user){
		Integer id = user.getuId();
		List<Role> roles = roleMapper.getRolesByUserId(id);
		return roles;
	}
}
