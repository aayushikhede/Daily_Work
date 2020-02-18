package com.cts.training;

public class Hr extends Employee {
	Hr(String name, String address, int age, String company_name) {
		super(name, address, age, company_name);
		// TODO Auto-generated constructor stub
	}

	void display() {
		System.out
				.println("name \t" + name + "address \t" + address + "age \t" + age + "company_name \t" + company_name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hr h = new Hr(" isha ", " indore ", 22, " cts ");
		h.display();
	}
}
