package Questions;

import java.util.Scanner;

public class PrefixSearchDemo{

	public static void main(String[] args) {
		

		String num;
		Scanner sc = new Scanner(System.in);
		
		String[] str = {"100","1010","1100" ,"100"};
		
		System.out.println(" Enter Prefix string for search");
		num =sc.next();
		int len=str.length;
		System.out.println(len);
		int count=0;
		String num1;
		
		for( int j=0 ; j<len ;j++)
		{
			num1=str[j];
			if(num1.startsWith(num)&& !num1.equals(num))
			{
				count ++;
		
			}
		}

	}
	}
	





	
