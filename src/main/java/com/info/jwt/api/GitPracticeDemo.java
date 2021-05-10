package com.info.jwt.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GitPracticeDemo {

	private String name;
	private Integer stateid;
	private Double salary;

	public static String myHome2(String homeName) {

		return homeName;
	}

	public static String myHome(String homeName) {

		return homeName;
	}

	public String gitName(String name) {

		return name;
	}

	public Integer gitName(Integer num) {

		return num;
	}

	public String gitName(Integer num, String name) {

		return name + " " + num.toString();
	}
}
