package com.cts.training.calculator;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		if (a > b)
			return a - b;
		else
			return b - a;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public boolean isPrime(int number) {
		boolean status = false;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}
}
