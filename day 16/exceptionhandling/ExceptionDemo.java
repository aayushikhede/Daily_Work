package com.cts.training.exceptionhandling;

public class ExceptionDemo {

	public static void main(String...args) {
		// TODO Auto-generated method stub
		System.out.println("start the process");
		try {
		int number = Integer.parseInt(args[0]);
		System.out.println("value entered by user");
		int result = 10/10-number;
		System.out.println("result :"+result);
		String s ="good morning";
		System.out.println(s.length());
		System.out.println("end the process");
		}
		catch(ArithmeticException |NumberFormatException|NullPointerException|ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("ex.getMessage");
		}
		finally {
			System.out.println("it ");
		}
	
	}
	

}
