package com.info.jwt.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitPracticeDemoForPrepApplication {

	private Static HashMap<String,Integer> cache = new HashMap<>();
	public static void main(String[] args) {
		System.out.println("i am available now");
		SpringApplication.run(GitPracticeDemoForPrepApplication.class, args);
	}
	public Integer methodCall(Integer methodId) {
	System.out.println("it is returning method call id");
	return methodId;
	}
}
