package com.cts.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	String user, pass, url, driver;
	Connection com;
	Statement stmt;
	PreparedStatement ps;
	ServletContext context;
@Override
	public void init(ServletConfig config) throws ServletException {
	context= config.getServletContext();
		user =context.getInitParameter("userName");
		pass = context.getInitParameter("password");
		url = context.getInitParameter("url");
		driver = context.getInitParameter("driver");
		try {
			Class.forName(driver);
			com = DriverManager.getConnection(url, user, pass);
            System.out.println(com);
			System.out.println(config+ "from servlet 2");
			System.out.println(context+"from servlet 2");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("hello from service s2");
	}
}
