package contextparam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		String un = getInitParameter("username");
		String pw = getInitParameter("password");
		String age = getInitParameter("age");
		ServletContext context=getServletContext();
		String driver=context.getInitParameter("driver");
		PrintWriter out = response.getWriter();
		
		System.out.println(un);
		out.println(un);
		System.out.println(pw);
		out.println(pw);
		System.out.println(age);
		out.println(age);
		System.out.println(driver);
		out.println(driver);
	}

}
