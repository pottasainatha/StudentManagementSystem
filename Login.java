package com.registermodel.org;

public class Login {

private String email_Id;
private String password;
public Login(String email_Id, String password) {
	super();
	this.email_Id = email_Id;
	this.password = password;
}

public String getEmail_Id() {
	return email_Id;
}
public void setEmail_Id(String email_Id) {
	this.email_Id = email_Id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
