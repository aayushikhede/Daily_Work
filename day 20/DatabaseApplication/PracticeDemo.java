package com.cts.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PracticeDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3307/ctspune";
		Connection com = DriverManager.getConnection(url, "root", "root");
		Statement stmt = com.createStatement();

		// String query = "create table manager(mid int primary key , mname
		// varchar(50),city varchar(50) ,company varchar(50))";
		// String query = "insert into manager values (103,'meera',' chennai ','cts')";
		// String query = "delete from manager where mid=103 ";
		// String query = "update manager set mname ='rita' where mid =101 ";
		// String query ="alter table manager add domain varchar(20) ";
		// String query = "update manager set domain ='java' where mid =101 ";
		// String query = "update manager set domain ='java' where mid =102 ";
		/*
		 * int result = stmt.executeUpdate(query); if(result>0)
		 * System.out.println("record inserted successfully"); else
		 * System.out.println("something is wrong ..");
		 */
		String query = "select * from manager";
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3) + " : "
					+ rs.getString(4) + " : " + rs.getString(5));
		}
	}
}
