package com.cts.training.timeprograms;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Time15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate bday=LocalDate.of(2020, Month.DECEMBER,05);
		LocalDate today = LocalDate.now();
		Period m = Period.between(bday, today);
		System.out.println("time left "+m.getMonths());
	}

}
