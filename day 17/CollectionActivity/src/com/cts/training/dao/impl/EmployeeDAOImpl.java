package com.cts.training.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.cts.training.bean.Employee;

public class EmployeeDAOImpl {
	static ArrayList<Employee> employees = null;

	static {
		employees = new ArrayList<>();
		Employee emp1 = new Employee(4234, "Vijay", "Bangalore", "Developer", 20, 41241.89, 79879798L);
		Employee emp2 = new Employee(2324, "Neeraj", "Mumbai", "Software Engineer", 21, 23434.89, 121313L);
		Employee emp3 = new Employee(9987, "Sakshi", "Indore", "Test Engineer", 19, 19889.80, 979879798L);
		Employee emp4 = new Employee(1234, "Neha", "Pune", "DevOps Engineer", 23, 68908.12, 43432222L);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void deleteEmployee(Employee employee) {
       employees.remove(employee);
	}

	public void updateEmployee(Employee employee) {
       employee.setName("aditi");
	}

	public Employee getEmployeeById(int id) {
		 for(Employee emp :employees)
	       {
	    	   if(emp.getId() == id)
	    	   {
	    		  
	    		   return emp;
	    	   }
	       }return null;
	}

	public List<Employee> getAllEmployees() {
		return employees;
	}

}
