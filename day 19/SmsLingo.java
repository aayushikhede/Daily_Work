package Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SmsLingo {

	public static void main(String[] args) {
		HashMap<String, String> wr = new HashMap<String, String>();
		// TODO Auto-generated method stub
		String s1 = null, s2 = null, s3 = null, s4;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a message");
		String msg = sc.nextLine();
		wr.put("you", "u");
		wr.put("today", "2day");
		wr.put("and", "n");

		Set<String> keys = wr.keySet();
		for (String key : keys) {
			msg = msg.replaceAll(key, wr.get(key));
		}

		System.out.println(msg);

	}

}
