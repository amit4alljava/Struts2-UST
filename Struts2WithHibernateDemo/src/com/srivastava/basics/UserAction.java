package com.srivastava.basics;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
private String userid;
private String userName;
private String message;
public String execute(){
	User user = new User();
	user.setUserid(this.getUserid());
	user.setUserName(this.getUserName());
	UserDAO userDAO = new UserDAO();
	if(userDAO.addUser(user))
	{
		this.setMessage("Record Added...");
	}
	else
	{
		this.setMessage("Not Able to add Record");
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
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}

}
