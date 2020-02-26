
public class lambdaEx {

	public static void main(String[] args) {
	helo add=(a,b)->a+b;
	helo sub=(a,b)->a-b;
	helo mul=(a,b)->a*b;
	helo div=(a,b)->a/b;
	System.out.println(add.calc(3, 4));
	System.out.println(sub.calc(3, 4));
	System.out.println(mul.calc(2, 3));
	System.out.println(div.calc(6, 3));
	}
}
	
interface helo{	
	public int calc(int a ,int b);

}
