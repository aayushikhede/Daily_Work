package com.cts.training;

public class Employee extends Person {
	String company_name;

	Employee(String name, String address, int age, String company_name) {
		super(name, address, age);
		// TODO Auto-generated constructor stub
		this.company_name = company_name;
	}

	/*
	 * void display() { System.out.println("Company_name \t" + company_name); }
	 */
}
