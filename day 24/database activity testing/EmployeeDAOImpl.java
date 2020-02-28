package com.cts.training.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.training.bean.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	Connection conn = getConnection();
	PreparedStatement ps = null;

	@Override
	public boolean addEmployee(Employee employee) {
		String sql = "insert into employee values(?,?,?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setString(4, employee.getDesignation());
			ps.setInt(5, employee.getAge());
			ps.setInt(6, employee.getPhone());
			ps.setInt(7, employee.getSalary());

			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean deleteEmployee(Employee employee) {

		String sql = "delete from employee where id =?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, employee.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean updateEmployee(Employee employee) {
		String sql = "update employee set name =? where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, employee.getId());
			ps.setString(1, employee.getName());
			ps.setInt(2, employee.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public Employee getEmployeeById(int id) {
		String sql = "select * from employee where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			Employee emp = new Employee();
			while (rs.next()) {

				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAddress(rs.getString("address"));
				emp.setDesignation(rs.getString("designation"));
				emp.setAge(rs.getInt("age"));
				emp.setPhone(rs.getInt("phone"));
				emp.setSalary(rs.getInt("salary"));

			}
			return emp;
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		String sql = "select * from employee";
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAddress(rs.getString("address"));
				emp.setDesignation(rs.getString("designation"));
				emp.setAge(rs.getInt("age"));
				emp.setPhone(rs.getInt("phone"));
				emp.setSalary(rs.getInt("salary"));
				employees.add(emp);

			}
			return employees;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ctspune";
			conn = DriverManager.getConnection(url, "root", "root");
			System.out.println("connection ");
			return conn;

		} catch (Exception e) {

			return null;
		}

	}

}
