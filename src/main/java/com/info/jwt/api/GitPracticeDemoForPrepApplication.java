package com.info.jwt.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitPracticeDemoForPrepApplication {

	private Static Integer companyId = 23;
	public static void main(String[] args) {
		SpringApplication.run(GitPracticeDemoForPrepApplication.class, args);
	}

	public void gitHelp() {
	   System.out.println("i am out to get help for you");
	}

}
