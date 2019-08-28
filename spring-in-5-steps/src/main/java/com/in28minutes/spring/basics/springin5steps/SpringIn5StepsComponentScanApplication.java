package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	
	public static void main(String[] args) {
		/*
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDAO);
		*/
	}

}

