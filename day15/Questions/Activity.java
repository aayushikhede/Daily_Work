package Questions;
import java.util.*;

public class Activity {

		
		
		  public static void main(String[] args){

		        Scanner sc = new Scanner( System.in );
		        int input,input2;
                System.out.println("enter two no min and max");
		        input = sc.nextInt();
		        input2 = sc.nextInt();
		        int count = 0;

		      
		        for (int range = input; range <= input2; range++){ 
		            String str = String.valueOf(range);
		            while(str.contains("1")) {
		           str =str.substring(str.indexOf("1")+1);
		           count++;
		               }
		            }
		        
		        System.out.println(count);
		      }
	}


