package com.cts.training.timeprograms;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Time8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LocalDate l = LocalDate.now();
      LocalDate next = l .plus(1,ChronoUnit.WEEKS);
      System.out.println(next);
	}

}
