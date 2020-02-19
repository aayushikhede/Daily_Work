package com.cts.training.stringclass;

public class StringActivity {
	

	public static boolean isTitleCase(String s) {
		boolean r = false;
		String arr[] = s.split("\\s+");
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i].charAt(0);
			if (ch >= 65 && ch <= 90) {
				r = true;
			} else {
				r = false;
				break;
			}
		}
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Global Warming"; // input string

		// Q.1 To display the last four characters.
		String lastFourDigits = ""; // substring containing last 4 characters
		if (input.length() > 4) {
			lastFourDigits = input.substring(input.length() - 4);
		} else {
			lastFourDigits = input;
		}
		System.out.println(lastFourDigits);

		// Q.2 To display the substring starting from index 4 and ending at index 8.
		String msg = input.substring(3, 8);// to display substring
		System.out.println(msg);

		// Q.3 To check whether string has alphanumeric characters or not.
		System.out.println(input.matches("[a-zA-Z0-9]+"));// to check alphanumeric no

		// Q.4 To trim the first four characters from the string.
		String msg2 = input.substring(4); // TO TRIM FIRST 4
		System.out.println(msg2);

		// Q.5To trim the last four characters from the string.
		System.out.println(input.substring(0, input.length() - 4)); // to trim last four

		// Q.6 To display the starting index for the substring "Wa".
		int output = input.indexOf("W");
		System.out.println(output);// returns 6

		// Q.7 To change the case of the given string.
		String msg3 = input.toLowerCase(); // lower case
		System.out.println(msg3);

		String msg4 = input.toUpperCase(); // upper case
		System.out.println(msg4);

		// Q.8 To replace all the occurrences of letter "a" in the string with "*"
		String msg6 = input.replace('a', '*'); // replace
		System.out.println(msg6);

		// Q.9 To check if the string is in title case
		char result = input.charAt(0);// char at
		if (result >= 65 && result <= 90) {
			System.out.println("true");
		} else
			System.out.println("false");
		
		String str = "aayushi khede";
		boolean b=isTitleCase(str);
		System.out.println(b);
		
		

	}

}
