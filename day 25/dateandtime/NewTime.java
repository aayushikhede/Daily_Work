package com.cts.training.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 LocalDate local = LocalDate.now();
		 System.out.println(local);
		 LocalTime local1 = LocalTime.now();
		 System.out.println(local1);
		 LocalDateTime L1 = LocalDateTime.now();
		 System.out.println(L1);
	}

}
