package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet4 extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("image/jpeg");
		File f1=new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
		FileInputStream fn=new FileInputStream(f1);
		byte []b=new byte[(int)f1.length()];
		fn.read(b);
		ServletOutputStream out=response.getOutputStream();
		out.write(b);
		out.flush();
		out.close();
		
	}

}
