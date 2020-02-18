package cts.training;

public class GetandSet {

	private int age;
	private double salary;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
       
	void dispay()
	{
		System.out.println("age is "+age);
		System.out.println("salary is "+salary);
	}
	public static void main(String[] args) {
		GetandSet g =new GetandSet();
		g.setAge(5);
		
		g.setSalary(5000);
		g.dispay();
	}
}
