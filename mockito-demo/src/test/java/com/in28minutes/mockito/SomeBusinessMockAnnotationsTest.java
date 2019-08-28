package com.in28minutes.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class SomeBusinessMockAnnotationsTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		
		DataService dataServiceMock = mock(DataService.class);
		
		//dataServiceMock.retrieveAllData() => new int[] {24,15,3}
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

}
