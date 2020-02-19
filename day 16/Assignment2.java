package Questions;

import java.util.*;

public class Assignment2 {
	public static void main(String args[])
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter string :");
	String str = input.nextLine();
	for(int i = 0;i<str.length();i++)
	{
		if (i % 2 == 0)
			System.out.print(Character.toUpperCase(str.charAt(i)));
		else
			System.out.print(Character.toLowerCase(str.charAt(i)));
	}
}

}
