

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SmiRegistrationServlet
 */
public class SmiRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		pw.println(request.getParameter("lname"));
		pw.println(request.getParameter("fname"));
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DriverManager
					.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
							"system", "great123");
			stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from reg");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
		} catch (SQLException ex)
		{
			ex.printStackTrace();
		} finally
		{
			try
			{
				if (con != null)
				{
					con.close();
					con = null;
				}
			} catch (SQLException ex)
			{
				ex.printStackTrace();
			}
			try
			{
				if (stmt != null)
				{
					stmt.close();
					stmt = null;
				}
			} catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}	
	}

}
