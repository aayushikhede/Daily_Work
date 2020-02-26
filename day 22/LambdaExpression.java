
public class LambdaExpression {
	public static void main(String[] args) {
		// Runnable r = () -> System.out.println("hello runnable");
		// Thread t = new Thread(r);
		// t.start();

		Hello h = () -> "good morning";
		Hello h2= () -> "good night";
		Hello h1 = () -> "good evening";
		System.out.println(h.greetings());
		System.out.println(h1.greetings());
		System.out.println(h2.greetings());
	}
}

@FunctionalInterface
interface Hello {
	String greetings();
	// void display();
}