package com.cts.training;


import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/RequestHandlerServlet")
public class SecondFilter implements javax.servlet.Filter {

	@Override
	public void destroy() {
		System.out.println("FROM DESTROY OF SEC FILTER");
	}

	@Override
	public void doFilter(ServletRequest rq, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		if(rq.getParameter("pwd").equals("123")){
			chain.doFilter(rq, res);
		}
		else
		{
			res.getWriter().write("<h1>invalid password </h1>");
		}
		System.out.println("FROM DOFILTER OF SEC FILTER");
		System.out.println("FROM DOFILTER OF 2 FILTER");
        System.out.println("req pre processing logic ---from sf");
		chain.doFilter(rq, res);
		System.out.println("req post processing logic ---from sf");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

		System.out.println("FROM INIT OF SEC FILTER");
	}

}
