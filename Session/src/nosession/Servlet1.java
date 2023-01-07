package nosession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("param1");
		out.println("param1:"+s1+"<br>");

		out.println("<body bgcolor='gray'>");
		out.println("<form action='Servlet2'>");
		out.println("parammeter2:");
		out.println("<input type='text' name='param2'/></br>");
		out.println("<input type='submit' value='submit'/></br>");
		out.println("</form>");
		out.println("</body>");
	}

}
