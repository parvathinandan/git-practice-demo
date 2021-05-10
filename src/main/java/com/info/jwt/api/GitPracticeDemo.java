package com.info.jwt.api;

public class GitPracticeDemo {

	private String name ;
	private Integer stateid;
	private Double salary ;
	
	public String gitName(String name) {
		
		return name;
	}
	
public Integer gitName(Integer num) {
		
		return num;
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getStateid() {
	return stateid;
}

public void setStateid(Integer stateid) {
	this.stateid = stateid;
}

public Double getSalary() {
	return salary;
}

public void setSalary(Double salary) {
	this.salary = salary;
}

public Double gitName(Double name) {
	
	return name;
}
public String gitName(Integer num,String name) {
	
	return name +" "+num.toString();
}
}
