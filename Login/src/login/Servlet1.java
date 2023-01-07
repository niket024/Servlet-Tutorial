package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet
{

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		String un = request.getParameter("username");
		String pw = request.getParameter("password");
		System.out.println(un);
		System.out.println(pw);
		int status=0;
		PrintWriter out = response.getWriter();
		String sql = "select * from registration where uname='" + un + "'and pwd='" + pw + "'";
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
							"jdbc", "GREAT123");
			stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			if(rs.next())
			{
				out.println("your login is success!");
				out.println("<a href='https://www.facebook.com/'>for facebook click here</a>");

			}
			else
			{
				out.println("your login is failed!!");
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
//		if(status>0)
//		{
//			RequestDispatcher rd = request.getRequestDispatcher("success.html");
//			rd.include(request, response);
//			out.println("are u happy!");
// 
//
//		}
//		else
//		{
//			out.println("your data is not inserted due to some DB error!");
//
//		}
		System.out.println("done");
		out.println("done");
	}
}
