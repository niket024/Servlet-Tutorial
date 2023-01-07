package com.pack1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("servlet1-begin");
		PrintWriter out = response.getWriter();
		String s1=request.getParameter("param1");
		String s2=request.getParameter("param2");
		out.println("servlet1-begin<br>");
		request.setAttribute("attr1", "hello");
		//response.sendRedirect("Servlet2?param1="+s1+"&param2="+s2);
		response.sendRedirect("Servlet2");
		
		out.println("servlet1-end<br>");
		System.out.println("servlet1-end");

	}

}
