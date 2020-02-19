package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Activity2 {
	public static String sortString(String inputString) {

		char tempArray[] = inputString.toCharArray(); // convert input string to char array

		Arrays.sort(tempArray); // sort tempArray

		return new String(tempArray); // return new sorted string
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Strings :");
		String str = sc.next();
		String outputString = sortString(str);
		System.out.println("Input String : " + str);
		System.out.println("Output String : " + outputString);
	}
}
