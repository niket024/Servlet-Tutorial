package register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet
{

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();

		int status=0;
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		String skill = request.getParameter("skills");
		String skills[] = request.getParameterValues("skills");
		String education = request.getParameter("education");
		System.out.println("fname:" + fname);
		System.out.println("lname:" + lname);
		System.out.println("address:" + address);
		System.out.println("gender:" + gender);
		System.out.println("skill:" + skills);
		 System.out.println("skills:" + Arrays.toString(skills));
		System.out.println("education:" + education);
		String sql = "insert into registration values('" + fname + "','"
				+ lname + "','"+ uname + "','"+ pwd + "','" + address + "','" + gender + "','" + Arrays.toString(skills)
				+ "','" + education + "')";
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
							"JDBC", "GREAT123");
			stmt = con.createStatement();
			status=stmt.executeUpdate(sql);
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
		if(status>0){
			System.out.println("registartion success!!");
			out.println("registartion success!!<br>");
			out.println("<html><body><a href='login.html'>Please click here for login</a></body></html>");
		}else{
			System.out.println("registation failed!!");
			out.println("registation failed!!");
			out.println("<html><body><a href='login.html'>Please click here for login</a></body></html>");

		}

	}

}
