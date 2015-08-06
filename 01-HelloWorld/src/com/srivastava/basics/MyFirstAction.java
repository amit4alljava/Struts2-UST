package com.srivastava.basics;

import com.opensymphony.xwork2.ActionSupport;

//POJO Class
// 1st Way to Create Action (POJO Class)
// 2nd Way to Create Action (Implement Action Interface)
// 3rd Way to Create Action (extend ActionSupport Class)
public class MyFirstAction extends ActionSupport{ //implements Action{
	private String message; // Instance var of Action
	
	

	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}
	
	public String addUser(){
		this.setMessage("Welcome User");
		//return "success";
		return SUCCESS;
	}
	
	public String deleteUser(){
		this.setMessage("Welcome User");
		//return "success";
		return SUCCESS;
	}

	public String updateUser(){
		this.setMessage("Welcome User");
		//return "success";
		return SUCCESS;
	}

	public String showMessage(){
		this.setMessage("Hello Client ");
		//return "success";
		return SUCCESS;
	}
}
