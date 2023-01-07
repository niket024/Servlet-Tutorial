package com.nik;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet
{

	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("init");
	}

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("service");
	}

	public void destroy()
	{
		System.out.println("destroy");
	}

}
