import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;


public class ControlAction extends ActionSupport{

	User user = new User();
	private ArrayList<User> userList = new ArrayList<User>();
	private void prepareData(){
		user.setUserName("Amit");
		user.setUserid(1001);
		for(int i = 1; i<=5 ; i++){
			User userObject = new User();
			userObject.setUserName("Mike");
			userObject.setUserid(100+i);
			userList.add(userObject);
		}
	}
	public String execute(){
		this.prepareData();
		return SUCCESS;
		
	}
	
	
	public ArrayList<User> getUserList() {
		return userList;
	}
	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
