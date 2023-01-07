package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter3 implements Filter
{
	@Override
	public void init(FilterConfig arg0) throws ServletException
	{
		System.out.println("filter3-init");
	}
@Override
public void doFilter(ServletRequest arg0, ServletResponse arg1,
		FilterChain arg2) throws IOException, ServletException
{
	PrintWriter out = arg1.getWriter();

	
	out.println("filter3-dofilter-begin<br>");
	arg2.doFilter(arg0, arg1);
	
	out.println("filter3-dofilter-end");
}
	

	

	@Override
	public void destroy()
	{
		System.out.println("filter3-destroy");
	}
}
