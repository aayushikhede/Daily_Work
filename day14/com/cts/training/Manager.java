package com.cts.training;

public class Manager extends Employee {
	int e_id, emergency_no;

	Manager(String name, String address, int age, String company_name, int e_id, int emergency_no) {
		super(name, address, age, company_name);
		// TODO Auto-generated constructor stub
		this.e_id = e_id;
		this.emergency_no = emergency_no;
	}

	/*
	 * void display() { System.out.println("e_id \t" + e_id + "emergency_no \t" +
	 * emergency_no); }
	 */
}
