package com.evaluating.model.config;

import java.util.List;

public class Service {
	private String name; 
	private List<Connect> connects;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Connect> getConnects() {
		return connects;
	}
	public void setConnects(List<Connect> connects) {
		this.connects = connects;
	}
	
	
	
}
