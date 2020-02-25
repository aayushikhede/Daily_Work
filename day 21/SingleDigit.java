/*given a number we need to find the number of times its digits need
 to be added so it becomes a single digit number .
*/
package Questions;

import java.util.Scanner;

public class SingleDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();
		System.out.println(getResult(number));
	}

	static int getResult(int num) {
		int result = 0;
		while (num != 0 || result > 9) {
			if (num == 0) {
				num = result;
				result = 0;
			}
			result = result + num % 10;
			num = num / 10;
		}
		return result;
	}

}
