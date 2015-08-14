package com.srivastava.actions;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	private String message;
	
	
	
	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}
	
	public String update(){
		this.setMessage("User Update Operation Called...");
		return SUCCESS;
	}
	
	public String delete(){
		this.setMessage("User Delete Operation Called...");
		return SUCCESS;
	}

	public String add(){
		this.setMessage("User Add Operation Called...");
		return SUCCESS;
	}
}
