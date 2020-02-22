package Questions;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int temp = sc.nextInt();
		int start = 36;
		System.out.println(temp + " ");
		for (int n = 1; n < temp; n++) {
			if (n % 2 == 0) {
				start = start - 2;
				System.out.println("" + start + "");
			} else {
				start = start - 2;
				System.out.println("" + start + "");
			}

		}
	}
}
