package com.cts.training.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Registration() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("username");
		String pass = request.getParameter("passsword");
		String eml = request.getParameter("email");
		String cntry = request.getParameter("country");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/servlet";
			Connection com = DriverManager.getConnection(url, "root", "root");

			String query = "insert into registration values(?,?,?,?)";
			PreparedStatement ps = com.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, pass);
			ps.setString(3, eml);
			ps.setString(4, cntry);

			ResultSet rs = ps.executeQuery(query);
			while (rs.next()) {
				int i = 0;
				System.out.println("*****employee record*****");
				System.out.println("name is: " + rs.getString(1) + "\n  PASSWORD is : " + rs.getString(2)
						+ "\n EMAIL is : " + rs.getString(3) + " \n COUNTRY is : " + rs.getString(4));
				i++;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
