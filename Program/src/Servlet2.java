

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Servlet2() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	String s1=request.getParameter("param1");
	String s2=request.getParameter("param2");
	String sum=s1+s2;
			System.out.println("sum="+sum);
			out.println(sum);
	
	}

}
