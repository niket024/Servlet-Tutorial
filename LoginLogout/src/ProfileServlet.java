import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProfileServlet extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();
		String uname = (String) session.getAttribute("uname");
		String pwd = (String) session.getAttribute("pwd");
		System.out.println(uname);
		System.out.println(pwd);
		if (uname != null && pwd != null)
		{
			if (session.getAttribute("code").equals("abc"))
			{
				out.println("Welcome " + uname);
			}
		} else
		{
			out.println("You are not login<br>");
			out.println(
					"For login pls click here<a href='Login.html'>Login</a>");
		}
	}

}
