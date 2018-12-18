package com.evaluating.model.config;

import java.util.List;

public class Server {
	private String name;		     	//服务器名
	private List<Service> services;		//服务列表
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Service> getServices() {
		return services;
	}
	public void setServices(List<Service> services) {
		this.services = services;
	}
	
}
