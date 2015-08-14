import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;


public class RegAction extends ActionSupport {

	private String userid;
	private String password;
	private String address;
	private String recieveUpdates;
	private String designation;
	private String hobbies;
	private String accept;
	private ArrayList<String> countryList = new ArrayList<>();
	private String country ;
	private String language;
	
	private ArrayList<Language> languageList = new ArrayList<>();
	
	private void prepare(){
		languageList.add(new Language("en", "English"));
		languageList.add(new Language("hi", "Hindi"));
		languageList.add(new Language("fr", "French"));
		countryList.add("India");
		countryList.add("USA");
		countryList.add("UK");
		countryList.add("SriLanka");
		
	}
	public String execute(){
		this.prepare();
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRecieveUpdates() {
		return recieveUpdates;
	}
	public void setRecieveUpdates(String recieveUpdates) {
		this.recieveUpdates = recieveUpdates;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getAccept() {
		return accept;
	}

	public void setAccept(String accept) {
		this.accept = accept;
	}
	public ArrayList<String> getCountryList() {
		return countryList;
	}
	public void setCountryList(ArrayList<String> countryList) {
		this.countryList = countryList;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String disp(){
		this.prepare();
		return SUCCESS;
	}
	public ArrayList<Language> getLanguageList() {
		return languageList;
	}
	public void setLanguageList(ArrayList<Language> languageList) {
		this.languageList = languageList;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	
	
	
	
}
