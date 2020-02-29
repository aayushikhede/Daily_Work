package com.cts.training.timeprograms;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Time12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zoneId = ZoneId.of("Asia/Calcutta");

		LocalDateTime localDateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
		System.out.println("Date and Time in delhi :" + zonedDateTime);
	}
}
