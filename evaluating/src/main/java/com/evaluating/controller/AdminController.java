package com.evaluating.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/**
 * 
 * @author Administrator
 * @do 系统管理Controller，关于权限，用户管理，等超级管理员的功能均放在这个页面
 */
@RequestMapping("main")
public class AdminController {
	@RequestMapping("toMain")
	public String toMainPage() {
		return "admin/main";
	}
	@RequestMapping("toBlank")
	public String toBlank() {
		return "admin/info/_blank";
	}
	
	@RequestMapping("toAddEdit")
	public String toAddEdit() {
		return "admin/info/add-edit";
	}
	@RequestMapping("auxiliar")
	public String toAuxiliar() {
		return "admin/info/auxiliar";
	}
	@RequestMapping("btn")
	public String btn() {
		return "admin/info/btn";
	}
	@RequestMapping("btn1")
	public String btn1() {
		return "admin/info/btn1";
	}
	@RequestMapping("children")
	public String children() {
		return "admin/info/children";
	}
	@RequestMapping("dataTable")
	public String dataTable() {
		return "admin/info/data-table";
	}
	@RequestMapping("foldingPanel")
	public String foldingPpanel() {
		return "admin/info/folding-panel";
	}
	@RequestMapping("form")
	public String form() {
		return "admin/info/form";
	}
	@RequestMapping("progressBar")
	public String progressBar() {
		return "admin/info/progress-bar";
	}
	@RequestMapping("tabCard")
	public String tabCard() {
		return "admin/info/tab-card";
	}
	@RequestMapping("table")
	public String table() {
		return "admin/info/table";
	}
	@RequestMapping("tips")
	public String tips() {
		return "admin/info/tips";
	}
	@RequestMapping("treeTable")
	public String treeTable() {
		return "admin/info/tree-table";
	}
	@RequestMapping("welcome")
	public String welcome() {
		return "admin/info/welcome";
	}
}
