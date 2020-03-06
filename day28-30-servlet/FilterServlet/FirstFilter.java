package com.cts.training;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FirstFilter
 */
@WebFilter("/FirstFilter")
public class FirstFilter implements Filter {

	public FirstFilter() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() {
		// TODO Auto-generated method stub

		System.out.println("FROM DESTROY OF  1  FILTER");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("FROM DOFILTER OF 1 FILTER");
	}

	public void init(FilterConfig fConfig) throws ServletException {

		System.out.println("FROM INIT OF 1 FILTER");
	}

}
