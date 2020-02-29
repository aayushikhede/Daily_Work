package com.cts.training.timeprograms;

import java.time.LocalDate;
import java.time.MonthDay;

public class Time5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1997, 05, 12);
		MonthDay month = MonthDay.of(birthday.getMonthValue(), birthday.getDayOfMonth());
		MonthDay m =  month.from(today);
		if (month.equals(m)) {
			System.out.println("happy birth day");
		} else {
			System.out.println("not today");
		}
		
		
	}

}
