package com.cts.training.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

public class JdbcPreparedStatemnetDemo {

	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// System.out.println("enter EMPLOYEE NAME");
		// String name = br.readLine();
		// System.out.println("enter EMPLOYEE ID");
		// int id = Integer.parseInt(br.readLine());
		// System.out.println("enter EMPLOYEE address");
		// String address = br.readLine();
		// System.out.println("enter EMPLOYEE age");
		// int age = Integer.parseInt(br.readLine());
		// System.out.println("enter EMPLOYEE phone");
		// int phone = Integer.parseInt(br.readLine());

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3307/ctspune";
		Connection conn = DriverManager.getConnection(url, "root", "root");
		// String query = "insert into employee values(?,?,?,?,?)";
		// String query = "update employee set name =? where id = ?";
		// String query = "delete from employee where id =?";
		String query = "select * from employee ";
		PreparedStatement ps = conn.prepareStatement(query);
		/*
		 * ps.setInt(1,id); ps.setString(2, name); ps.setString(3, address);
		 * ps.setInt(4,age); ps.setLong(5,phone);
		 */
		// ps.setString(1,name);CollectionActivity
		// ps.setInt(1, id);

		/*
		 * int result = ps.executeUpdate(); if (result > 0)
		 * System.out.println("data deleted"); else
		 * System.out.println("something is wrong");
		 */
		ResultSet rs = ps.executeQuery(query);
		while (rs.next()) {
			int i = 0;
			System.out.println("*****employee record*****");
			System.out.println("id is: " + rs.getInt(1) + "\n  name is : " + rs.getString(2) + "\n address is : "
					+ rs.getString(3) + " \n age is : " + rs.getString(4) + " \n phone is : " + rs.getString(5));
			i++;
		}

	}

}
