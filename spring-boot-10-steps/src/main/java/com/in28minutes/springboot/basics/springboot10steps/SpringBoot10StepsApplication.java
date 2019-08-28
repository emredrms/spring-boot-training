package com.in28minutes.springboot.basics.springboot10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot10StepsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringBoot10StepsApplication.class, args);
		
		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
