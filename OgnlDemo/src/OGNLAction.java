import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class OGNLAction extends ActionSupport {
	private String stringArray[];
	private ArrayList<String> names= new ArrayList<>();
	private Map<String,Integer> tempMap = new HashMap<>();
	
	User user = new User();
	
	ArrayList<User> userList =new ArrayList<>();
	
	
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ArrayList<User> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}

	public Map<String, Integer> getTempMap() {
		return tempMap;
	}

	public void setTempMap(Map<String, Integer> tempMap) {
		this.tempMap = tempMap;
	}

	public ArrayList<String> getNames() {
		return names;
	}

	public void setNames(ArrayList<String> names) {
		this.names = names;
	}

	public String[] getStringArray() {
		return stringArray;
	}

	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
	}

	private void prepareData(){
		stringArray = new String[]{"Product1","Product2","Product3"};
		names.add("Tom");
		names.add("Mike");
		names.add("Rim");
		tempMap.put("Delhi",32);
		tempMap.put("Mumbai",33);
		user.setUserName("Amit");
		userList.add(user);
		User user = new User();
		user.setUserName("Ram");
		userList.add(user);
		
	}
	
	public String execute(){
		this.prepareData();
		ActionContext actionContext = ActionContext.getContext();
		Map<String,Object> sessionMap = actionContext.getSession();
		sessionMap.put("username", "Amit Srivastava");
		return SUCCESS;
	}
	
	public String sayHello(){
		return "Hello User ";
	}
	

}
