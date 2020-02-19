package com.cts.training.interface1;

public interface Hello {
	int add (int a, int b);

}
class Implementation implements Hello{
	public int add(int a,int b)
	{return a+b;}
	
}

class Testing1{
	public static void main(String args[])
	{
		 Implementation a=new  Implementation();
		 System.out.println(a.add(3, 6));
	}
}