package com.cts.training.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//1 load database driver for mysql 8
		// 1.1 by using forName() method
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 1.2 by creating reference of driver
		// Driver d = new com.mysql.cj.jdbc.Driver();

		// 2. establish the connection
		String url = "jdbc:mysql://localhost:3307/ctspune";
		Connection com = DriverManager.getConnection(url, "root", "root");
		// System.out.println("connection established successfully");
		// System.out.println(com.getClass().getName());

		Statement stmt = com.createStatement();
		// String query = "delete from employee where id =1";

		/*
		 * int result = stmt.executeUpdate(query); if (result > 0)
		 * System.out.println("record deleted successfully!!!!"); else
		 * System.out.println("something is wrong ..");
		 */

		String query = "select * from employee";
		// for select we use different method
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			/*
			 * int id = rs.getInt(1); String name = rs.getString(2); String address =
			 * rs.getString(3); int age = rs.getInt(4); long phone = rs.getLong(5);
			 * System.out.println(id + " : " + name + " : " + address + " : " + age + " : "
			 * + phone);
			 */
			System.out.println(rs.getInt(1) + ":" + rs.getString(2) + ":" + rs.getString(3) + ":" + rs.getInt(4) + ":"
					+ rs.getLong(5));
		}

	}
}