package com.xnd.domain;

public class Teacher {
	private String tea_id;
	private String name;
	private String sex;
	private String age;
	private String teach_class;
	
	
	public String getId() {
		return tea_id;
	}
	public void setId(String id) {
		this.tea_id = id;
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
	public String getTeach_class() {
		return teach_class;
	}
	public void setTeach_class(String teach_class) {
		this.teach_class = teach_class;
	}
	

	
	@Override
	public String toString() {
		return "Teacher [id=" + tea_id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", teach_class=" + teach_class
				+ "]";
	}
}
