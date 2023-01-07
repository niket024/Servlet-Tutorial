package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet6 extends HttpServlet
{
	int counter = 00;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{

		counter = counter + 33;
		PrintWriter out = response.getWriter();
		// out.println("<body bgcolor='#ff00"+counter+"'>");
		// out.println("<body bgcolor='#66ff"+counter+"'>");
		out.println("<body bgcolor='#66cc" + counter + "'>");
		out.println("<font color='#3300" + counter
				+ "'size='6'>counter value is changing:" + counter
				+ "</font><br>");
		response.setIntHeader("refresh", 2);
	}

}
