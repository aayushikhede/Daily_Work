package com.cts.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogInServlet extends HttpServlet {
	String user, pass, url, driver;
	Connection com;
	Statement stmt;
	PreparedStatement ps;
	@Override
	public void init(ServletConfig config) throws ServletException {
		user = config.getInitParameter("userName");
		pass = config.getInitParameter("password");
		url = config.getInitParameter("url");
		driver = config.getInitParameter("driver");
		try {
			Class.forName(driver);
			com = DriverManager.getConnection(url, user, pass);
			System.out.println(com);
		
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {

			stmt = com.createStatement();
			String sql = "insert into registration values (?,?,?,?)";
			 ps = com.prepareStatement(sql);
			ps.setString(1, req.getParameter("username"));
			ps.setString(2, req.getParameter("password"));
			ps.setString(3, req.getParameter("email"));
			ps.setString(4, req.getParameter("country"));

			ps.executeUpdate();
           
			PrintWriter o = resp.getWriter();
			o.println("<html><body><b>Successfully Inserted" + "</b></body></html>");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Override
	public void destroy() {
		 try {
			stmt.close();
			ps.close();
			com.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	
	}

}
