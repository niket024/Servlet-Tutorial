package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet7 extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("param1");
		out.println("param1:" + s1 + "<br>");
		Cookie c1 = new Cookie("param1", s1);
		response.addCookie(c1);

		out.println("<body bgcolor='#996633'>");
		out.println("<form action='Servlet8'>");

		out.println("parammeter2:");
		out.println("<input type='text' name='param2'/></br>");
		out.println("<input type='submit' value='submit'/></br>");

		out.println("</form>");
		out.println("</body>");
	}

}
