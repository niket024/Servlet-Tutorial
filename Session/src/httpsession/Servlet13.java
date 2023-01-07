package httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet13 extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		//session.setMaxInactiveInterval(10);
		String id = session.getId();
		out.println("id:" + id);
		out.println("<br>");

		out.println("isnew:" + session.isNew());
		out.println("<br><a href='Servlet13'>Again?</a>");
		
		//session.invalidate();
		// out.println("<br><a href='Servlet14;;jsessionid="+id+"'>Again?</a>");
		// String path=response.encodeUrl("Servlet13");
		// System.out.println("<br><a href='"+path+"'>Again</a>");

	}

}
