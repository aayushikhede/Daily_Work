package com.cts.training.operatiionsoncollection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {

	public static void main(String[] args) {	

		ArrayList<Employee> list = new ArrayList<Employee>();
		addEmployees(list);
		//Collection(sort.list); //used for comparable interface
		//SortById sbi =new SortById();
		//Collections.sort(list,sbi);
		//Collections.sort(list, new SortByName());
		//Collections.sort(list,new SortByAddress());
		Collections.sort(list,new SortByDesignation());
		for(Employee emp :list)
		{
		System.out.println(emp);
		}
	}

	private static void addEmployees(ArrayList<Employee> list) {
		Employee emp1 = new Employee(121, "Ram", "Pune", "Developer", 22, 41233.43, 1234567890L);
		Employee emp2 = new Employee(122, "Nisha", "Indore", "Software developer", 22, 41553.43, 1234564690L);
		Employee emp3 = new Employee(120, "Rohan", "Delhi", "Developer", 23, 20233.43, 1232457890L);
		Employee emp4 = new Employee(124, "Raghav", "Mumbai", "Testing", 20, 30000.43, 1346767989L);
		Employee emp5 = new Employee(125, "Shyam", "Indore", "Test eng", 21, 40030.43, 1234564260L);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		
	}

}
