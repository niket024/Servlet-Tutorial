 <%@ page import="java.sql.Connection"%>
  <%@ page import="java.sql.Statement"%>
  <%@ page import="java.sql.ResultSet"%>
  <%@ page import="java.sql.DriverManager"%>
  <%@ page import="java.sql.SQLException"%>
  <body bgcolor="gray"></body>
  <%
 
 
 // String sql = "insert into image values('" + img + "')";
  try
  {
  Class.forName("oracle.jdbc.driver.OracleDriver");
  }
  catch(ClassNotFoundException ex)
  {
  ex.printStackTrace();
  }
  
  Connection con=null;
  Statement stmt=null;
  ResultSet rs=null;
  boolean status=false;
  try
  {
  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","great123");
  stmt=con.createStatement();
  rs=stmt.executeQuery(sql);
  status=rs.next();
  }
  catch(SQLException ex)
  {
	  ex.printStackTrace();
  }
  finally
  {
	  try
	  {
		  if(rs!=null)
		  {
			  rs.close();
			  rs=null;
		  }
	 }
	  catch(SQLException ex)
	  {
		  ex.printStackTrace();
	  }
	  try
	  {
		  if(stmt!=null)
		  {
			  stmt.close();
			  stmt=null;
		  }
	 }
	  catch(SQLException ex)
	  {
		  ex.printStackTrace();
	  }
	  try
	  {
		  if(con!=null)
		  {
			  con.close();
			  con=null;
		  }
	  }
	  catch(SQLException ex)
	  {
		  ex.printStackTrace();
	  }
	}