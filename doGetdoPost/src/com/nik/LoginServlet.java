package com.nik;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		if (uname.equals("abc") && pwd.equals("xyz"))
		{
			
			out.println("Your Login is successfull....<br>");
			out.println("Uname=" + uname);
			out.println("PassWord=" + pwd);
			System.out.println("Uname=" + uname);
			System.out.println("PassWord=" + pwd);
		} 
		else
		{
			out.println("Your Login is failed....<br>");

		}
	}

}
