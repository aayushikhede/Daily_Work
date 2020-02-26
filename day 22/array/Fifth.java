package com.cts.traininig.array;

import java.util.Scanner;

public class Fifth {
	public int maximum(int a[]) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public int minimum(int a[]) {
		int min =a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= min) {
				min = a[i];
			}
		}
		return min;
	}
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
		System.out.println("max value "+m.maximum(a));
		System.out.println("min value "+m.minimum(a));
	}
}