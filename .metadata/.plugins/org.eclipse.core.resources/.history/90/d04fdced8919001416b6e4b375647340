package ReqAttributeMgmt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();

		request.setAttribute("key", 100);
		// System.out.println("------------");
		// request.setAttribute("key", 788);
		// System.out.println("------------");
		 request.removeAttribute("key");
		// System.out.println("------------");
		// System.out.println("end");
		out.println("done");

	}

}
