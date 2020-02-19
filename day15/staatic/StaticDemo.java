package com.cts.training.staatic;

public class StaticDemo {
	int x=10;
	static int y=20;
 public void show()
{
	System.out.println(y);
	System.out.println(x);
}
}
class test5
{
	public static void main(String[] args) {
		StaticDemo s =new StaticDemo();
		System.out.println(s.x);
		System.out.println(StaticDemo.y);
		StaticDemo s1 =new StaticDemo();
		StaticDemo s2 =new StaticDemo();
		s2.x=50;
		s1.y=30;
		System.out.println(s.x);
		System.out.println(s2.y);
	}}
