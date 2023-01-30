package com.xnd.domain;

import java.util.Date;

public class Studentinfo {
	private String stuinfo_id;
	private String name;
	private String sex;
	private String age;
	private String studydate;
	private String major;
	private String classroom;
	private String address;
	private String mobile;
	public String getId() {
		return stuinfo_id;
	}
	public void setId(String stuinfo_id) {
		this.stuinfo_id = stuinfo_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getStudydate() {
		return studydate;
	}
	public void setStudydate(String studydate) {
		this.studydate = studydate;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Studentinfo [id=" + stuinfo_id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", studydate=" + studydate
				+ ", major=" + major + ", classroom=" + classroom + ", address=" + address + ", mobile=" + mobile + "]";
	}

}
