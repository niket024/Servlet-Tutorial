package com.nik;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public LoginServlet()
	{
		super();
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		PrintWriter out = response.getWriter();
		if (uname.equals("abc") && pwd.equals("xyz"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("success.html");
			rd.forward(request, response);
			System.out.println("Login is success!!");
			
		} else
		{
			System.out.println("Login is failed!!");
			RequestDispatcher rd = request.getRequestDispatcher("failed.html");
			rd.forward(request, response);
		}
	}

}
