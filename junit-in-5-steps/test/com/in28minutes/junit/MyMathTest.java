package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class MyMathTest {

	MyMath myMath = new MyMath();
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@Test
	void sum_with3numbers() {
		System.out.println("Test1");
		int result = myMath.sum(new int[] {1,2,3});
		assertEquals(6, result);	
	}
	
	@Test
	void sum_with1numbers() {
		System.out.println("Test2");
		int result = myMath.sum(new int[] {1});
		assertEquals(1, result);
	}

}
