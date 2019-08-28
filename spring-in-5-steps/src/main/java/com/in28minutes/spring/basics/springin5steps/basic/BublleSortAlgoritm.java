package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bublle")
public class BublleSortAlgoritm implements SortAlgorithm {

	public int[] sort(int[] numbers) {
		
		return numbers;
	}
}
