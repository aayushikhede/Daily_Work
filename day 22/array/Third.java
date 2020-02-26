package com.cts.traininig.array;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int number = sc.nextInt();
		int a[] = new int[number];
		int a2[] = new int[a.length];
		System.out.println("enter elements in the array");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		for (int i = 0; i < a.length; i++) {
			 a2[i]=a[i];

		}
		System.out.println("elements of original array :");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "");

		}
		System.out.println();
		
		System.out.println("elements of new array :");
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i] + "");

		}

	}
}
