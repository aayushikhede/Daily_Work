package com.cts.training.timeprograms;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Time16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDateTime localDateTime=LocalDateTime.of(2020, Month.DECEMBER, 10, 11, 30);
		
		ZoneOffset zoneOffset=ZoneOffset.of("+05:30");
		OffsetDateTime offsetDateTime=OffsetDateTime.of(localDateTime, zoneOffset);
		System.out.println("Local DateTime Zone :"+offsetDateTime);
	}

}
