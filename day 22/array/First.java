package com.cts.traininig.array;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int number = sc.nextInt();
		int a[] = new int[number];
		System.out.println("enter elements in the array");
		for (int i = 0; i < a.length; i++) {
		
			a[i] = sc.nextInt();
		
		}
		for (int i = a.length - 1; i >= 0; i--) {
			
			System.out.println(a[i]+"");
		
		}
		
		
	}

}
