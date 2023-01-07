package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		String s1 = request.getParameter("param1");
		String s2 = request.getParameter("param2");
		response.setContentType("application/vnd.ms-excel");
		PrintWriter out = response.getWriter();
		out.println("parameter1:" + s1 );
		out.println("parameter2:" + s2 );
	}

}
