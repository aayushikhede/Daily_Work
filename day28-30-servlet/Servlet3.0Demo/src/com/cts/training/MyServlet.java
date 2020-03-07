package com.cts.training;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	public void task() {
		System.out.println("from task");
	}
	public MyServlet() {
		System.out.println("FROM CONSTRUCTOR");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("from init");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("from service");
		task();
	}

	@Override
	public void destroy() {
		System.out.println("from destroy");
	}

	public static void main(String[] args) {
		System.out.println("main");
	}
}
