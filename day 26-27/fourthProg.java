//to call float over double
public class fourthProg {

	public void add(int a, int b) {
	}

	public void add(double c, int d) {
		System.out.println("hello");
	}

	public void add(float c, float d) {
		System.out.println("bye");
	}
	
	public static void main(String[] args) {
		 fourthProg  f= new fourthProg();
		f.add(2.1f, 2.4f);
	}
	
}
