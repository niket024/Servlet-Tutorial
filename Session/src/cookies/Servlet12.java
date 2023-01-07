package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet12 extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException

	{
		PrintWriter out = response.getWriter();
		Cookie[] x = request.getCookies();
		if (x != null)
		{
			for (Cookie c1 : x)
			{
				out.println(c1.getName() + ":");
				out.println(c1.getValue() + "<br>");
			}
		} else
		{
			out.println("no cookies avilable");
		}

	}

}
