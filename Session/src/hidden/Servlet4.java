package hidden;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet4 extends HttpServlet
{

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("param1");
		String s2 = request.getParameter("param2");
		out.println("param1:" + s1 + "<br>");
		out.println("param2:" + s2 + "<br>");

	}

}
