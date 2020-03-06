package com.cts.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SourceServlet")
public class SourceServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("from doget to sourceservlet");
		String cusName = req.getParameter("customerName");
		int term = Integer.parseInt(req.getParameter("term"));
		int premiumamount = Integer.parseInt(req.getParameter("premium"));
		req.setAttribute("customerName", cusName);
		req.setAttribute("noOfYears", term);
		req.setAttribute("amount", premiumamount);
		System.out.println("paid amount :"+(premiumamount*term));
		PrintWriter out= resp.getWriter();
		out.write("<h1>your paid amount &nbsp ,&nbsp;"+(premiumamount*term)+"</h1>");
		RequestDispatcher dispatcher = req.getRequestDispatcher("http://localhost:8080/WEB_APPLICATIO/NewFile.html");
		dispatcher.include(req, resp);
	}
}
