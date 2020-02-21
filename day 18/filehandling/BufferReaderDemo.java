package com.cts.training.filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     
		
		        BufferedReader br = new BufferedReader(new
		        InputStreamReader(System.in));
		        System.out.println("Enter an integer");
		        int a = Integer.parseInt(br.readLine());
		        System.out.println("Enter a String");
		        String b = br.readLine();
		        System.out.printf("You have entered:- " + a +
		                          " and name as " + b);
		    
		
	}

}
