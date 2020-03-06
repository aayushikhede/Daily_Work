package com.cts.training;


import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/SecondFilter")
public class SecondFilter implements javax.servlet.Filter {

	@Override
	public void destroy() {
		System.out.println("FROM DESTROY OF SEC FILTER");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {

		System.out.println("FROM DOFILTER OF SEC FILTER");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

		System.out.println("FROM INIT OF SEC FILTER");
	}

}
