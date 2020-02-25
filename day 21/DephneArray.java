package Questions;

import java.util.Scanner;

public class DephneArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int number = sc.nextInt();
		int a[] = new int[number];
		System.out.println("enter elements in the array");
		for (int i = 0; i < number; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(dephneArray(a));

	}

	public static boolean dephneArray(int[] a) {
		int flag = 0, count = 0, count1 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				flag = 1;
			} 

		}
		for (int j = 0; j < a.length; j++) {
			if (a[j] % 2 == 0) {
				count++;
			} else {
				break;
			}
		}

		for (int k = a.length - 1; k >= 0; k--)
			if (a[k] % 2 == 0) {
				count1++;
			}else {
				break;
			}
		if (flag == 1) {
			if (count == count1) {
				return true;
			} else {
				return false;
			}
		} 
		else {
			return false;
		}
	}

}