package com.srivastava.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;


@Namespace("/User")
@ResultPath(value="/")

public class LoginAction extends ActionSupport{
	
	private String userid;
	private String password;
	private String message;
	
	@Action(value="loginAC", results={
			@Result(name="success",location="/result.jsp")
		})
	public String execute(){
		if(this.getUserid().equals(this.getPassword())){
			this.setMessage("Welcome "+this.getUserid());
		}
		else
		{
			this.setMessage("Invalid Userid and Password ");
		}
		return SUCCESS;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
