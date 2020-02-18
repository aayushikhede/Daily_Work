package com.cts.training;

public class Development extends Manager {
	Development(String name, String address, int age, String company_name, int e_id, int emergency_no) {
		super(name, address, age, company_name, e_id, emergency_no);
		// TODO Auto-generated constructor stub
	}

	void display() {
		System.out.println("name \t" + name + " address \t" + address + " age \t" + age + " company_name \t"
				+ company_name + "e_id \t" + e_id + "emergency_no" + emergency_no);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Development d = new Development(" ram ", " pune ", 25, " Cts ", 2 , 100 );
		d.display();
	}

}
