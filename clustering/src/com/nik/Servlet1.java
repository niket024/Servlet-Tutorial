package com.nik;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session=request.getSession();
		System.out.println(session.getId());
		System.out.println(session.isNew());
		ServletContext context=getServletContext();
		context.setAttribute("attr1", 20);
	}

}
