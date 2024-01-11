package com.sims.web;

public class Staff {
private String name,password,email;

public Staff() {
	super();
}

public Staff(String name, String password,String email) {
	this.name=name;
	this.password=password;
	this.email=email;
}
public void setName(String name) {
	this.name=name;
}
public String getName(){
	return name;
}
public void setPassword(String password) {
	this.password=password;
}
public String getPassword() {
	return password;
}

public void setEmail(String email) {
	this.email=email;
}
public String getEmail() {
	return email;
}
}
