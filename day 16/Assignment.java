package Questions;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Strings :");
		String str = sc.nextLine();
		String ch[] = str.split(" ");
		int s = str.length();

		for (int i = 0; i < s; i++) {

			System.out.println(ch[i]);
		}
	}
}