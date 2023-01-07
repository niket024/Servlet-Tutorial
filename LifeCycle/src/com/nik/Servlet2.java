package com.nik;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends GenericServlet
{

	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("init");
	}

	public void destroy()
	{
		System.out.println("destroy");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException
	{
		System.out.println("service");
		
	}


}
