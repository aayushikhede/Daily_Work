package com.cts.training.polymorphism;

import FlowOfProgram.Main;

public class A{


		// TODO Auto-generated method stub
		int x =10;
		public void display()
		{
			int y =20;
			System.out.println("class A");
		}

	}
class C extends A{
	@Override
	public void display()
	{
		
		System.out.println("class C");
	}
}


 class D{
	
	 public static void main(String args [])
	 {A a =new C();
	 a.display();
	 	
	 	}


}
