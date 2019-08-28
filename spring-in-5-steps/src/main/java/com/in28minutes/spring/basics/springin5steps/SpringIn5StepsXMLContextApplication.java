package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.scope.xml.XmlPersonDAO2;


public class SpringIn5StepsXMLContextApplication {

	public static void main(String[] args) {

		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BublleSortAlgoritm());

		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){

			System.out.println((Object)applicationContext.getBeanDefinitionNames());
			
			XmlPersonDAO2 xmlPersonDAO = applicationContext.getBean(XmlPersonDAO2.class);
			System.out.println(xmlPersonDAO);
			System.out.println(xmlPersonDAO.getXmlJdbcConnection());
		}
	}

}

