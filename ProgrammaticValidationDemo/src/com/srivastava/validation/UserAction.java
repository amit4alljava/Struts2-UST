package com.srivastava.validation;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	private String userid;
	private String userName;
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
	public String execute()
	{
		return SUCCESS;
	}
	@Override
	public void validate(){
		if(this.getUserid().length()==0){
			this.addFieldError("userid", this.getText("loginform.useriderror"));
			
		}
		if(this.getUserName().length()==0){
			this.addFieldError("userName", this.getText("loginform.usernameerror"));
		}
	}

}
