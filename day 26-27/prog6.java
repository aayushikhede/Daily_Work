
public class prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "java";
		String str2 = new String("java");
		String str3 = "java";
		String str4 = new String("java");
		StringBuffer sb1 =new StringBuffer("java");
		StringBuffer sb2 =new StringBuffer("java");
		if (sb1.equals(sb2)) {
		//if(str1==str2) { 
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

	}
}
