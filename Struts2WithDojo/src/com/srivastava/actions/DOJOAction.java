package com.srivastava.actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class DOJOAction extends ActionSupport {
private ArrayList<String> countryList = new ArrayList<>();

private String country;

public ArrayList<String> getCountryList() {
	return countryList;
}


public void setCountryList(ArrayList<String> countryList) {
	this.countryList = countryList;
}

private void prepare(){
	countryList.add("India");
	countryList.add("USA");
	countryList.add("UAE");
	countryList.add("UK");
	countryList.add("SriLanka");
	countryList.add("Singapore");
	
	
}

public String getCountry() {
	this.prepare();
	return country;
}


public void setCountry(String country) {
	this.country = country;
}


public String execute(){
	return SUCCESS;
}

public String display(){
	return SUCCESS;
}

}
