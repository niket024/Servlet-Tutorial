package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		out.println("Request headers are:");
		Enumeration<String> names = request.getHeaderNames();
		String name, value;
		while (names.hasMoreElements())
		{
			name = names.nextElement();
			value = request.getHeader(name);

			out.println(name + ":" + value + "<br>");
			//out.println("<B>"+name + "</B>:" + value + "<br>");
		}

	}
}