package com.in28minutes.spring.basics.springin5steps.cdi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsBasicApplication;
import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsCdiApplication;
import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

	@InjectMocks
	SomeCdiBusiness business;
	@Mock
	SomeCdiDao daoMock;

	@Test
	public void testBasicScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] { 2, 4 });
		int actualResult = business.findGreatest();
		assertEquals(4, actualResult);
	}

}
