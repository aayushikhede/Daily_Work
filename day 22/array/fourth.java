package com.cts.traininig.array;

import java.util.Scanner;

public class fourth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int number = sc.nextInt();
		int a[] = new int[number];
		System.out.println("enter elements in the array");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
	System.out.println("duplicate value are");
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; i < a.length; i++)
			if (a[i] == a[j]) {
				System.out.println(a[j]+"");
			}
		}
	}

}
