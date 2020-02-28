package com.cts.training.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;

public class EmployeeTest {
	private static EmployeeDAO employeeDao;
	private static Employee employee;

	@BeforeClass
	public static void init() {
		employee = new Employee();
		employeeDao = new EmployeeDAOImpl();
	}

	@Ignore
	@Test
	public void test_add_emp_success() {
		Employee emp = new Employee(6, "urvashi", "pune", "pat", 22, 12345, 20000);
		employeeDao.addEmployee(emp);
		// assertEquals(true, emp);
	}

	@Ignore
	@Test
	public void test_delete_emp_success() {
		Employee emp = employeeDao.getEmployeeById(1);
		assertEquals(true, employeeDao.deleteEmployee(emp));
	}

	@Ignore
	@Test
	public void test_update_emp_success() {
		Employee emp = employeeDao.getEmployeeById(2);
		employeeDao.updateEmployee(emp);
		assertEquals(true, employeeDao.updateEmployee(emp));
	}

	@Test
	public void test_emp_by_id_success() {
		Employee emp = employeeDao.getEmployeeById(2);
		assertEquals("aditi", emp.getName());
	}

	@Ignore
	@Test
	public void test_get_all_emp_success() {
		List<Employee> list = employeeDao.getAllEmployees();
		assertEquals("bhawna", list.get(2).getName());
	}

}
