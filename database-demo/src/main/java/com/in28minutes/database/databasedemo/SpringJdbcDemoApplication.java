package com.in28minutes.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@SpringBootApplication
public class SpringJdbcDemoApplication  {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
/*
	@Autowired
	PersonJdbcDao dao;
*/	
	/*
	public static void main(String[] args) {
		//SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}
	*/
/*
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("All users -> {}", dao.findAll());
		logger.info(" Users id 10001 - > {}", dao.findById(10001));
		logger.info(" Deleteting 10002 -> No of Rows Deleted - {}", dao.deleteById(10002));
		logger.info(" Insert 10004 - > {} ", dao.insert(new Person(10004, "Tara", "Berlin", new Date())));
		logger.info(" Update 10003 -> {}",  dao.update(new Person(10003, "Pieter", "Utrecht", new Date())));
	}
*/
}
