package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ObjeTest {

	@Test
	void test() {
		assertEquals(new Customer("Emre", "Durmus", "drmsemre@gmail.com", "123").toString(), Obje.returObje().toString());
		
	}

}
