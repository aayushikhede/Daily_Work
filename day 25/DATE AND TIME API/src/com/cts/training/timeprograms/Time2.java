package com.cts.training.timeprograms;

import java.time.LocalDate;

public class Time2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// current day,month and year
		LocalDate local = LocalDate.now();
		System.out.println(local);
		int day = local.getDayOfMonth();
		System.out.println(day);
		int month = local.getMonthValue();
		System.out.println(month);
		int year = local.getYear();
		System.out.println(year);
		System.out.printf("Year : %d , Month : %d , Day : %d \t %n", year, month, day);
	}

}
