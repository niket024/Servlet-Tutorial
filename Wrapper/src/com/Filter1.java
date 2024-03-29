package com;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Filter1 implements Filter
{

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException
	{
		HttpServletRequest hreq = (HttpServletRequest) arg0;
		HttpServletResponse hres = (HttpServletResponse) arg1;
		RequestWrapper wreq = new RequestWrapper(hreq);
		ResponseWrapper wres = new ResponseWrapper(hres);
		// arg2.doFilter(arg0, wres);
		// arg2.doFilter(wreq, wres);
		arg2.doFilter(arg0, arg1);
	}

	public void init(FilterConfig fConfig) throws ServletException
	{

	}

	@Override
	public void destroy()
	{

	}
}
