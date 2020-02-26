package com.cts.traininig.array;

import java.util.Scanner;

public class eight2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int number = sc.nextInt();
		int a[] = new int[number];
		System.out.println("enter elements in the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int largest = a[0];
		int secondLargest = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];

			} else if (a[i] > secondLargest) {
				secondLargest = a[i];

			}
		}

		System.out.println("\nSecond largest number is:" + secondLargest);

	}
}
