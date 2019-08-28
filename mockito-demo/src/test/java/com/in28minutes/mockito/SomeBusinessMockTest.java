package com.in28minutes.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {

	@Mock
	DataService dataServiceMock;

	@InjectMocks
	SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);

	@Test
	public void testFindTheGreatestFromAllData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

}
