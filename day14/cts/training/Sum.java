package cts.training;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int num1,num2,sum = 0;
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number : ");
		 num1 = s.nextInt();
		
        while(num1>0)
        {
		num2=num1%10;
		
		sum=sum+num2;
		num1=num1/10;
		
	}System.out.println("value is :"+sum);
        }

}
