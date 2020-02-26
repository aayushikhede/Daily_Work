package com.cts.training.nestedclasses;

public class LocalClass {
static int y =10;
	public void show() {
		class Local {
			 public void display() {
				System.out.println("local class example");
			}
		}
		Local l = new Local();
		l.display();

	}

	public static void main(String[] args) {

		LocalClass lc = new LocalClass();
		lc.show();
	}

}
