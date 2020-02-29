package com.cts.training.timeprograms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Time18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String date="20200229";
		
		LocalDate formatted=LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.printf("The format of %s is %s \t%n",date,formatted);
	}

}
