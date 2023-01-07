package com.nik;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{

		PrintWriter out = response.getWriter();
		ServletContext context = getServletContext();
		context.removeAttribute("attr1");
		HttpSession session = request.getSession();
		System.out.println(session.getId());
		System.out.println(session.isNew());
		out.println("done");
		//here new session id will not be created
	}

}
