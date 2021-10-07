
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();
		String uname = (String) session.getAttribute("uname");
		String pwd = (String) session.getAttribute("pwd");
		if (uname != null && pwd != null)
		{
			session.invalidate();
			out.println("You are logout successfully");
		} else
		{
			out.println("You are already logout");
		}
	}

}
