package com.cts.training.timeprograms;

import java.time.LocalDate;

public class Time11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate l = LocalDate.now();
		LocalDate tommorow=LocalDate.of(2020, 1, 03);
		if(l.isBefore(tommorow))
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
		if(l.isAfter(tommorow))
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
		
	}

}
