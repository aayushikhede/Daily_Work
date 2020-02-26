package com.cts.traininig.array;

import java.util.Scanner;

public class TwoDArray {

	public static void sumRow(int a[][], int rows, int column) {

		// sum of rows
		for (int i = 0; i < rows; i++) {
			int sumRow = 0;
			for (int j = 0; j < column; j++) {

				sumRow = sumRow + a[i][j];
			}
			System.out.println("sum of " + (i + 1) + " row :" + sumRow);
		}
	}

	public static void sumCol(int a[][], int rows, int column) {
		// sum of column
		for (int i = 0; i < rows; i++) {
			int sumCol = 0;
			for (int j = 0; j < column; j++) {

				sumCol = sumCol + a[j][i];
			}
			System.out.println("sum of " + (i + 1) + " column:" + sumCol);
		}
	}

	public static void sumDia(int a[][], int rows, int column) {
		int sumDia = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				if (i == j) {
					sumDia = sumDia + a[i][j];
				}

			}
		}
		System.out.println("sum of diagonal:" + sumDia);
	}

	public static void divisible(int a[][], int rows, int column) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				if (a[i][j] % 3 == 0 && a[i][j] % 5 == 0) {
					System.out.println("elements divisible by 3 and 5 are :" + a[i][j]);
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int rows = sc.nextInt();
		int column = sc.nextInt();

		System.out.println("enter elements in the array");
		int a[][] = new int[rows][column];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int[] x : a) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println(" ");
		}
		 sumRow(a, rows, column);
		 sumCol(a, rows, column);
		 sumDia(a, rows, column);
		 divisible(a, rows, column);
	}
}
