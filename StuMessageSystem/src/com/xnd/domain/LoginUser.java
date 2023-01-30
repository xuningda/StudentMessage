package com.xnd.domain;

import javax.servlet.http.HttpServlet;

public class LoginUser {
	private String id;
	private String password;
	private String job;
	
	public LoginUser() {
		super();
	}
	public LoginUser(String id,String password) {
		super();
		this.id=id;
		this.password=password;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "LoginUser [id=" + id + ", password=" + password + ", job=" + job + "]";
	}
	
	
}
