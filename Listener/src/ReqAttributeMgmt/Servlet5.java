package ReqAttributeMgmt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet5 extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();

		ServletContext context = getServletContext();
		System.out.println("begin");
		context.setAttribute("key", 100);
		System.out.println("------------");
		context.setAttribute("key", 100);
		System.out.println("------------");
		context.removeAttribute("key");
		System.out.println("------------");
		System.out.println("end");
		out.println("done");
	}

}
