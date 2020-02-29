package com.cts.training.timeprograms;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Time9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate l = LocalDate.now();
	      LocalDate prev = l .minus(1,ChronoUnit.YEARS);
	      LocalDate NEXT = l .plus(1,ChronoUnit.YEARS);
	      
	      System.out.println("todays date"+l);
	      System.out.println("prev year date"+prev);
	      System.out.println("NEXT year"+NEXT);
	}

}
