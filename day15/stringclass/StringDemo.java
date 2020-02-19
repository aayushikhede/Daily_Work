package com.cts.training.stringclass;

public class StringDemo {
public static void main(String aregs[])
{
	String city ="indore";
	String city2 ="pune";
	String city3 ="indore";
	String city4 = new String("pune");
	String city5 = new String("mumbai");
	String city6 = new String("indore");
	System.out.println(city==city3);
	System.out.println(city2==city4);
	System.out.println(city.equals(city6));
	String msg= "i   am   an  enginerr";
	System.out.println(msg.length()); //length method
	
	String year =" of 2020 ";
	String msg1=msg.concat(year);//concat
	System.out.println(msg1);
	
	 char result = msg.charAt(10);//char at
	 System.out.println(result);
	 
	 String msg2= msg.substring(3,8);
	 System.out.println(msg2);
	 
	 String msg3= msg.substring(3);
	 System.out.println(msg2);
	 
	 int msg4=msg.indexOf(city);
	 System.out.println(msg4);
	 
	 int msg5=msg.lastIndexOf("a");
	 System.out.println(msg5);
	 
	 int s= city.compareTo(city2);
	 
	 String msg6=msg.toLowerCase();
	 System.out.println(msg6);
	 
	 String msg7=msg.toUpperCase();
	 System.out.println(msg7);
	 
	 String msg8=msg.trim();
	 System.out.println(msg8);
	 
	 String msg9=msg.replace('e','a');
	 System.out.println(msg9);
	 
	}
}