package com.in28minutes.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {

	@Inject
	SomeCdiDao someCDIDAO;

	public SomeCdiDao getSomeCDIDAO() {
		return someCDIDAO;
	}

	public void setSomeCDIDAO(SomeCdiDao someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}
	
	public int findGreatest() {
		int greatest = Integer.MIN_VALUE;
		int[] data = someCDIDAO.getData();
		for (int value : data) {
			if(value > greatest) {
				greatest =value;
			}
		}
		return greatest;
	}
	
}
