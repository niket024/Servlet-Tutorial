package ReqAttributeMgmt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet4 extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
	    
	     HttpSession session=request.getSession();
		
		session.setAttribute("key", 100);
		System.out.println("------------");
		session.setAttribute("key", 100);
		System.out.println("------------");
		session.removeAttribute("key");
		System.out.println("------------");
		
		 out.println("done");
	}

}
