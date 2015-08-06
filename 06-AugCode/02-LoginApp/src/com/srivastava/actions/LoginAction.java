package com.srivastava.actions;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.srivastava.dao.LoginDAO;

/*
 * 1. There are 2 Approaches to do Session Handling in Struts2
 * 1. ServletRequestAware Interface - it will the HttpServletRequest Object
 * through HttpServletRequest object we can get the HttpSession object
 * 2. SessionAware Interface
 */
public class LoginAction extends ActionSupport implements SessionAware, ModelDriven<User>{
//implements ServletRequestAware {

	/*private String userid;
	private String password;
	private String message;*/
	private User user = new User();
	private HttpServletRequest request;
	private Map<String, Object> sessionMap;
	
	
	
	/*public String getMessage() {
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
	}*/

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute(){
		return SUCCESS;
	}

	public String checkLogin(){
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(user.getUserid());
		userDTO.setPassword(user.getPassword());
		/*userDTO.setUserid(this.getUserid());
		userDTO.setPassword(this.getPassword());*/
		LoginDAO loginDAO = new LoginDAO();
		String action = ERROR;
		try {
			if(loginDAO.authenicateLogin(userDTO))
			{
				sessionMap.put("user", user.getUserid());
				//HttpSession session = request.getSession(true); // Here it is Creating a Fresh Session
				//session.setAttribute("user", this.getUserid());
				user.setMessage("Welcome "+user.getUserid());
				//this.setMessage("Welcome "+this.getUserid());
				action = SUCCESS;
			}
			else
			{
				user.setMessage("Invalid Userid or password ");
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



	/*@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		
	}*/



	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap  = sessionMap;
		
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
}
