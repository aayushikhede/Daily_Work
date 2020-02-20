package com.cts.training.controller;

import java.util.List;
import java.util.Scanner;

import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAOImpl;;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeDAOImpl empObj = new EmployeeDAOImpl();	
		Employee emp = new Employee(111, "Disha", "Bhopal", "Digital Engineer", 22, 46566.77, 46546656L);
		empObj.addEmployee(emp);
		Employee emp1 =empObj.getEmployeeById(4234); //call by id
		System.out.println(emp1);
		empObj.updateEmployee(emp1);  // to update
		System.out.println(emp1);
		empObj.deleteEmployee(emp1);  //to delete
     	List<Employee> list = empObj.getAllEmployees();
	    list.forEach(System.out::println);
		System.out.println(list);
		
		//List<Employee> list = empObj.getAllEmployees();
	  // list.forEach(System.out::println);
		
		System.out.println("****employee management system**** ");
		System.out.println("choose options");
		System.out.println("1.add employee");
		System.out.println("2.update employee");
		System.out.println("3. rename employee");
		System.out.println("4. get employee by id");
		System.out.println("5. display all employee");
		System.out.println("6. exit");
		int choice;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your choice :");
		choice = sc.nextInt();
	    sc.close();
	   
		switch (choice) {
		case 1:
			addEmployee(Employee employee);
		    break;
		case 2:
			 System.out.println("Enter the employee number:");
            int empID = sc.nextInt();
             deleteEmployee(Employee employee);
			break;
		case 3:
			System.out.println(" rename employee");
			employee.setName("aditi");
			break;
		case 4:
			System.out.println(" get employee by id");
			for (Employee emp : employees) {
				if (emp.getId() == id) {

					return emp;
				}
			}
			return null;
			break;
		case 5:
			System.out.println(" display all employee");
			public List<Employee> getAllEmployees() {
				return employees;}
				break;
		
		case 6:
			break;
			
		
		}
	}

}
