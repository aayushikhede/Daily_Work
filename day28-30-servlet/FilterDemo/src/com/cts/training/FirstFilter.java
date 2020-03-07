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
@WebFilter("/RequestHandlerServlet")
public class FirstFilter implements Filter {

	


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if(request.getParameter("un").equals("kiran")){
			chain.doFilter(request, response);
		}
		else
		{
			response.getWriter().write("<h1>invalid user </h1>");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

		System.out.println("FROM INIT OF 1 FILTER");
	}
	public void destroy() {
		

		System.out.println("FROM DESTROY OF  1  FILTER");
	}

}
