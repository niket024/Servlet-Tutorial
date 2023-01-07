package com.nik;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		String param1 = request.getParameter("param1");
		String param2 = request.getParameter("param2");
		int num1 = Integer.parseInt(param1);
		int num2 = Integer.parseInt(param2);
		int sum = num1 + num2;

		out.println("the sum of param1 and param2=" + sum);
		System.out.println("the sum of param1 and param2=" + sum);

	}

}
