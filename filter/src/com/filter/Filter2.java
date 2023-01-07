package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter2 implements Filter {
	private FilterConfig config;

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("filter2-init");
		config = arg0;
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		PrintWriter out = arg1.getWriter();

		System.out.println("filter2-dofilter-begin");
		out.println("filter2-dofilter-begin<br>");
		String s1=config.getInitParameter("con1");
	    out.println("con1 value="+s1+"<br>");
		arg2.doFilter(arg0, arg1);
		System.out.println("filter2-dofilter-end");
		out.println("filter2-dofilter-end<br>");
	}

	@Override
	public void destroy() {
		System.out.println("filter2-destroy");
	}
}
