package com.cts.training.operatiionsoncollection;

import java.util.Comparator;

public class SortByDesignation implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.getDesignation().compareTo(emp2.getDesignation());
	}

}
