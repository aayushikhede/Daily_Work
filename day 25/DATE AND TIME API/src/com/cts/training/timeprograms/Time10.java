package com.cts.training.timeprograms;

import java.time.Clock;

public class Time10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock=Clock.systemUTC();
		System.out.println("Clock :"+clock);//Clock :SystemClock[Z]
		
		Clock defaultClock=Clock.systemDefaultZone();
		System.out.println("Clock :"+defaultClock);//Clock :SystemClock[Asia/Calcutta]


	}

}
