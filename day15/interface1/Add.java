package com.cts.training.interface1;

public interface Add {
	int add(int a, int b);

	default int mult(int a, int b) // interface do allows default methods
	{
		return a * b;
	}

}

interface Subs extends Add {
	static int mod(int a, int b) // interface do allows static methods
	{
		return a % b;
	}

	int sub(int a, int b);
}

class Div {
	public double div(double a, double b) {
		return a / b;
	}

}

class Implementation extends Div implements Subs {
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {

		if (a > b)
			return a - b;
		else
			return b - a;
	}
}

class Testing1 {
	public static void main(String args[]) {
		Subs s = new Implementation();
		System.out.println(s.add(3, 9));
		System.out.println(s.sub(9, 16));
		System.out.println(s.mult(9, 2));
		System.out.println(Subs.mod(8, 5));
		Implementation a = new Implementation();
		System.out.println(a.add(3, 6));
		System.out.println(a.sub(9, 10));
		System.out.println(a.div(10, 6));
	}
}