package com.srivastava.basics;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String userid;
	private String password;
	private String jsonString;
	private String message;
	public String getUserid() {
		return userid;
	}
	
	public String execute() throws Exception{
		System.out.println("JSON String is "+jsonString);
		JSONObject json = (JSONObject) new JSONParser().parse(jsonString);
		this.setUserid((String)json.get("userid"));
		this.setPassword((String)json.get("password"));
		System.out.println("Userid is "+userid+" and Password is "+password);
		if(this.getUserid().equals(this.getPassword())){
			this.setMessage("Welcome "+this.getUserid());
		}
		else
		{
			this.setMessage("Invalid Userid or Password !");
		}
		return SUCCESS;
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
	public String getJsonString() {
		return jsonString;
	}
	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
