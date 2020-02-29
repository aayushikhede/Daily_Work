package com.cts.training.dateandtime;

import java.util.Date;


public class DateAndTime {

	public static void main(String[] args) {
		Date date = new Date(0);
		System.out.println(date);
		
		int day = date.getDay();
		switch (day) {

		case 0:
			System.out.println("sunday");
			break;

		case 1:
			System.out.println("monday");
			break;

		case 2:
			System.out.println("tuesday");
			break;

		case 3:
			System.out.println("wednesday");
			break;

		case 4:
			System.out.println("thursday");
			break;

		case 5:
			System.out.println("friday");
			break;

		case 6:
			System.out.println("saturday");
			break;

		default:
			System.out.println("wrong");

		}
	}

}
