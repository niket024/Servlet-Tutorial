
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet
{

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out =response.getWriter();
		out.println("servlet1 from browser");
		System.out.println("servlet1 from console");
	}

}
