package www.cts.training.java;

import cts.training.GetandSet;

public class Employee {
	 int phoneNumber = 1234567899;
	 String name = "ram";
	 String designation = "PAT";

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
/*	public static void main(String[] args) {
		Employee e =new Employee();
		System.out.println("phonenumber is :"+e.getPhoneNumber());
		System.out.println("designation  is :"+e.getName());
		System.out.println("name is :"+e.getDesignation());
	
		
	}
*/
}
