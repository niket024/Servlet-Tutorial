package com.nik;

import java.io.IOException;
import java.io.PrintWriter;

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
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		Person p1=new Person();
		session.setAttribute("k1", p1);
		session.removeAttribute("k1");
		out.println("done");
	}

}