package com.evaluating.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.evaluating.model.Role;
import com.evaluating.model.User;

import net.sf.json.JSONArray;

public class RoleServiceTest {
	
	private static RoleService roleService;

	//@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		  //加载                                                                                                   
        BeanFactory beanFactory = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","applicationContext-mybatis.xml"});                
        //获取bean                                                                                               
        roleService = (RoleService) beanFactory.getBean(RoleService.class);   
	}

	//@Test
	public void test() {
		User user= new User();
		user.setuId(2);
		List<Role> rolesByUser = roleService.getRolesByUser(user);
		JSONArray json = JSONArray.fromObject(rolesByUser);
		System.out.println(json.toString());
	}

}
