package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataDemoApplication {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonSpringDataRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDemoApplication.class, args);
	}
	/*
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info(" User id 10001 -> {}", repository.findOne(10001));
		logger.info(" Insert 10004 - > {} ", repository.save(new Person(10004, "Tara", "Berlin", new Date())));
		logger.info(" Update 10003 -> {}",  repository.save(new Person(10003, "Pieter", "Utrecht", new Date())));
		
		logger.info(" All users -> {}", repository.findAll());
	}
	*/

}
