package com.cts.training.timeprograms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Time20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String birthday="Jan 10 1985";
		try
		{
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMM dd yyyy");
			LocalDate birth=LocalDate.parse(birthday, formatter);
			System.out.printf("The Date %s is formatted in %s %n",birthday,birth);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
