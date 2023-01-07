package com.nik;

import java.io.IOException;
import java.io.PrintWriter;

import javax.print.DocFlavor.STRING;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out =response.getWriter();
		String param1=request.getParameter("param1");
		String param2=request.getParameter("param2");
		int n1=Integer.parseInt(param1);
		int n2=Integer.parseInt(param2);
		int sum=n1+n2;
		out.println("Sum="+sum);
		System.out.println("Sum="+sum);
	}

}
