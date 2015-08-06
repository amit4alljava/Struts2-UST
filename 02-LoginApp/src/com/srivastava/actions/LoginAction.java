package com.srivastava.actions;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import com.srivastava.dao.LoginDAO;

public class LoginAction extends ActionSupport {

	private String userid;
	private String password;
	private String message;
	
	
	
	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
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

	public String execute(){
		return SUCCESS;
	}

	public String checkLogin(){
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(this.getUserid());
		userDTO.setPassword(this.getPassword());
		LoginDAO loginDAO = new LoginDAO();
		String action = ERROR;
		try {
			if(loginDAO.authenicateLogin(userDTO))
			{
				this.setMessage("Welcome "+this.getUserid());
				action = SUCCESS;
			}
			else
			{
				this.setMessage("Invalid Userid or password ");
				action= "invalid";
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return action;
	/*	if(this.getUserid().equals(this.getPassword())){
			this.setMessage("Welcome "+this.getUserid());
			return SUCCESS;
		}
		else
		{
			this.setMessage("Invalid Userid or password ");
			return ERROR;
		}*/
	}
	
}
