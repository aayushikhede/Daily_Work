package www.cts.training.java;

import java.util.Scanner;

public class Salary extends Employee {
	private double pay,basicPay;
	private double PF;
	private double incomeTax;

   
	Scanner s =new Scanner(System.in);
	System.out.println("enter total pay");
	pay= s.nextDouble();	
    
	basicPay= pay/30;
	
	public double getBasicPay() {
		return PF;
	}
	public void setBasiPay(double basicpay) {
		basicPay=basicpay;
	}

	
	public double getPF() {
		return PF;
	}
	

	public void setPF(double pF) {
		PF = pF;
	}

	public double getIncomeTax() {
		return incomeTax;
	}

	public void setIncomeTax(double incomeTax) {
		this.incomeTax = incomeTax;
	}

	void display() {
		System.out.println("name is" + getName());
		System.out.println("designation is " + getDesignation());
		System.out.println("phone number is" + getPhoneNumber());
		System.out.println("basic salary is " + getBasicPay());
		System.out.println("pf is " + getPF());
		System.out.println("income tax is " + getIncomeTax());
		
	}

	public static void main(String[] args) {
		Salary s = new Salary();

		s.setName("rita");
		s.setDesignation("pat");
		s.setPhoneNumber(1234567890);
		s.setBasicPay(10000);
		s.setPF(2000);
		s.setIncomeTax(500);
		s.display();

	}
}
