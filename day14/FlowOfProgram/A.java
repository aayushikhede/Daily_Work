package FlowOfProgram;

public class A {
	A() {
		super();
		System.out.println("1");
	}

	{
		System.out.println("2");
	}
}

class B extends A {
	B() {
		super();
		System.out.println("3");
	}

	B(int a) {
		System.out.println("4");
	}

	{
		System.out.println("5");
	}

}
