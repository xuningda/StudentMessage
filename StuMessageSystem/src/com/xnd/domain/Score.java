package com.xnd.domain;

public class Score {
	private String stusc_id;
	private String name;
	private String major;
	private String classroom;
	private String math;
	private String java;
	private String mysql;
	
	public String getId() {
		return stusc_id;
	}
	public void setId(String id) {
		this.stusc_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public String getMath() {
		return math;
	}
	public void setMath(String math) {
		this.math = math;
	}
	public String getJava() {
		return java;
	}
	public void setJava(String java) {
		this.java = java;
	}
	public String getMysql() {
		return mysql;
	}
	public void setMysql(String mysql) {
		this.mysql = mysql;
	}
	
	
	@Override
	public String toString() {
		return "Score [id=" + stusc_id + ", name=" + name + ", major=" + major + ", classroom=" + classroom + ", math=" + math
				+ ", java=" + java + ", mysql=" + mysql + "]";
	}

}
