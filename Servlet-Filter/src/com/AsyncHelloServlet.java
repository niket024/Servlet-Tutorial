package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AsyncHelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: "+ Thread.currentThread().getName()).append(request.getContextPath());
		request.startAsync();
		System.out.println("done " + Thread.currentThread().getName());
		System.out.println("Servlet done Time in milliseconds: "+System.currentTimeMillis());
	}

}
