package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		String un = request.getParameter("username");
		String pw = request.getParameter("password");
		PrintWriter out = response.getWriter();
		if ("abc".equals(un) && "xyz".equals(pw))
		{
			System.out.println("Login is very succes!");
			out.println("Login is very succes!");
			response.sendRedirect("https://www.facebook.com/");
			System.out.println(un);
			System.out.println(pw);
			out.println(un);
			out.println(pw);
		}
		else
		{
			System.out.println("login is failed!");
			out.println("login is failed pls enter the correct username and passsword!");
			out.println("<br>");

			out.println("<a href='Login.html'>Pls try Again</a>");

		}
		
	}

}
