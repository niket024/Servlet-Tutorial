package com.pack1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Servlet2 extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		String s1=request.getParameter("param1");
		String s2=request.getParameter("param2");
		String s3=(String)request.getAttribute("attr1");
	
		System.out.println("servlet2-begin");
		System.out.println("param1:"+s1);
		System.out.println("param2:"+s2);
		System.out.println("attr1:"+s3);
		java.io.PrintWriter out = response.getWriter();
		out.println("servlet2-begin<br>");
		out.println("param1:"+s1+"<br>");
		out.println("param2:"+s2+"<br>");
		out.println("attr1:"+s3+"<br>");
		out.println("servlet2-end<br>");
		System.out.println("servlet2-end");

	}

}