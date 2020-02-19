package com.cts.training.exceptionhandling;

public class ExceptionClassDemo2 {
	public static void divide(int a, int b) throws CustomException {
		if (b > 0) {
			System.out.println(a / b);
		} else {
			throw new CustomException();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			divide(4, 0);
		} catch (CustomException ex) {
			System.out.println(ex.getMessage("divide by 0"));
		}
	}
}

class CustomException extends Exception {
	public CustomException() {
		// TODO Auto-generated constructor stub
		System.out.println("custom message");
	}

	String getMessage(String message) {
		return "Exception is :" + message;
	}
}
