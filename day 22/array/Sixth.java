package com.cts.traininig.array;

import java.util.Scanner;

public class Sixth {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Fifth m = new Fifth();
	System.out.println("enter the size of array");
	int number = sc.nextInt();
	int a[] = new int[number];
	System.out.println("enter elements in the array");
	for (int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
	}
	System.out.println("EVEN NUMBERS ARE :");
	for (int i = 0; i < a.length; i++) {
		
		if(a[i]%2==0)
		{
			System.out.println(a[i]+"");
		}
	}
	System.out.println("ODD NUMBERS ARE :");
	for (int i = 0; i < a.length; i++) {
		
		if(a[i]%2!=0)
		{
			System.out.println(+a[i]+" ");
		}
	}
	
}
}