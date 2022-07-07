package com.ganesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GitPraciceProjectApplication {
	private Map<String, Object> cache = new HashMap<>();
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(GitPraciceProjectApplication.class, args);
		System.out.println("Welcome to the git project");
		// Working on HIS-122
		int a=10;
		context.close();
	}
	
	//HIS-301 changes
	public void loadDataToCache(){
		//logic
	}

}
