package com.srivastava.basics;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private String userid;
	private String userName;
	
	public String execute(){
		return SUCCESS;
	}
	
	public String longTime(){
		for(int i =0; i<1000000; i++){
			System.out.println(i);
		}
		return SUCCESS;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
