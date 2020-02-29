package com.cts.training.timeprograms;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LocalDate date = LocalDate.now();
      if(date.isLeapYear())
      {
    	  System.out.println("this is leap year");
      }
      else
      {
    	  System.out.println("not a leap year");
      }
	}

}
