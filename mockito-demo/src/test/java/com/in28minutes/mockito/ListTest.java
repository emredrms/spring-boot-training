package com.in28minutes.mockito;

import static org.junit.Assert.*;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void testSize() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10);
		assertEquals(10, listMock.size());
	}
	
	@Test
	public void testSize_mulitipleReturns() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());
	}

}
