package com.nik;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import com.oreilly.servlet.MultipartRequest;

public class UploadServlet extends HttpServlet
{

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		MultipartRequest m = new MultipartRequest(request, "E:/Upload");
		out.print("<body bgcolor='pink'><center>");
		out.print("successfully uploaded");
		out.print("</center></body>");
	}
}