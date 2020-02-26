package com.cts.training.nestedclasses;

public class AnonymousInnerClass {

	public void greet() {
		System.out.println("outer class");
	}
}

class MainDemo {
	public static void main(String[] args) {
		AnonymousInnerClass n = new AnonymousInnerClass() {
			@Override
			public void greet() {
				System.out.println("anonymous class");
			}
		};
		AnonymousInnerClass n1 = new AnonymousInnerClass() {
			@Override
			public void greet() {
				System.out.println("anonymous class 2");
			}
		};
		n.greet();
		n1.greet();
	}
}
