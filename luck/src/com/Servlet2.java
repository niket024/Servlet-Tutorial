package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet
{

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("hello servlet");
		PrintWriter out=response.getWriter();
		out.println("hello to all");
		out.println("hello to all");
		out.println("hello to all");
		out.println("hello to all");
		out.println("hello to all");
		out.println("hello to all");
	}

}
