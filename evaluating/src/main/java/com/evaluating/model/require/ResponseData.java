package com.evaluating.model.require;

public class ResponseData {
	private String message;             //正确或错误信息；
	private String code;                //错误代码
	private Page page;					//页面数据
	private boolean success;			//成功状态
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	
}
