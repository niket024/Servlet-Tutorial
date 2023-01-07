package httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet10 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException

	{
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		out.println(session.getId()+"<br>");
		String s1 = (String) session.getAttribute("param1");
		String s2 = request.getParameter("param2");
		out.println("param1:" + s1 + "<br>");
		out.println("param2:" + s2 + "<br>");

	}

}
