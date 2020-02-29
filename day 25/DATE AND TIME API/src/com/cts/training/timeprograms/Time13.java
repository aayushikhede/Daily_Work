package com.cts.training.timeprograms;

import java.time.Month;
import java.time.YearMonth;

public class Time13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YearMonth today = YearMonth.now();

		System.out.printf("The current %s : %d \t %n", today, today.getMonthValue());

		YearMonth creditExpiry = YearMonth.of(2020, Month.DECEMBER);
		System.out.println("Your Creadit Card Expiry is :" + creditExpiry);
	}

}
