package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet8 extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException		
	{
		PrintWriter out = response.getWriter();
		Cookie[] x = request.getCookies();
		Cookie c1 = x[0];

		String s1 = c1.getValue();
		out.println("param1:" + s1 + "<br>");
		// System.out.println(c1.getPath());

		String s2 = request.getParameter("param2");

		out.println("param2:" + s2 + "<br>");

	}

}
