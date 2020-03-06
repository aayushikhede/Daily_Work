package com.cts.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Target")
public class Target extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("from doget to Target");
		String customerName= (String) req.getAttribute("customerName");
		Integer term =(Integer) req.getAttribute("noOfYears");
		Integer premium=(Integer) req.getAttribute("amount");
		
		double sumAssured =(premium*term)+(premium*term)*20/100;
		System.out.println("AMOUNT AFTER MATURITY : "+sumAssured);
		PrintWriter out= resp.getWriter();
		out.write("<h1>your amount after maturity &nbsp , &nbsp;"+sumAssured+"</h1>");
	}
}
