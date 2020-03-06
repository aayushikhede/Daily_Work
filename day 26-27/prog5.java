//call task 2 without 1. inheritance 2.without removing private 3.without making method static 
//4.without calling reflection method  
public class prog5 {

	private prog5()
	{
		
	}
	
	public void task2() {
		System.out.println("from task 2 to class fifth");
	}
	
	public static void main(String[] args) {
		prog5 f = new prog5();
	}

}
class Test
{void show(){
	//prog5 f = new prog5();
	f.task2(); 
	
}}
