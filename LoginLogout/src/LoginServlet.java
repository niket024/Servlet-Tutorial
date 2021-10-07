import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet
{

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		String code = "abc";
		PrintWriter out=response.getWriter();
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		HttpSession session = request.getSession();
		session.setAttribute("uname", uname);
		session.setAttribute("pwd", pwd);
		session.setAttribute("code", code);
		out.println("<a href='home.html'>Home</a><br>");
		out.println("You are successfully Login!!!<br>");
		out.println("Welcome "+uname);
		
	}

}
