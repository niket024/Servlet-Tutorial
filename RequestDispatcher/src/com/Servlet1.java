package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{

		PrintWriter out = response.getWriter();
		out.println("servlet1-begin<br>");
		System.out.println("servlet1-begin<br>");

		request.setAttribute("attr1", "hello");
		RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
		// ServletContext context=getServletContext();
		// RequestDispatcher rd = context.getRequestDispatcher("/Servlet2");

		 //rd.include(request, response);
		rd.forward(request, response);
		out.println("servlet1-end<br>");

	}

}
