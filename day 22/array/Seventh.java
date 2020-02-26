package com.cts.traininig.array;

import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Fifth m = new Fifth();
		System.out.println("enter the size of array");
		int number = sc.nextInt();
		int a[] = new int[number];
		System.out.println("enter elements in the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("ARRAY IN ASCENDING ORDER ARE :");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}

	}

}
