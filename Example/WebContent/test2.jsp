<body bgcolor="pink"></body>
<%
String un=request.getParameter("UN");
String pw=request.getParameter("PW");
if ("abc".equals(un)&&"xyz".equals(pw))
	out.println("your login is success");
else 
	out.println("your login is fail");
%><br>
Home?then click on image
<a href="Test.jsp"><img src="Tulips.jpg" height="15" width="15"/>
</a>
<form action="test3.jsp">
<center>
<marquee behavior="alternate">
<font color="green" size="6">LOGIN ADMIN</font></marquee>
<table bgcolor="yellow" border="6" height='150' width='150'>
<tr>
<td>Username:</td>
<td><input type="text" name="UN"><br></td></tr>
<tr>
<td>Password:</td>
<td><input type="password" name="PW"><br></td></tr>

<tr>
<td><input type="submit" value="Login"></td></tr></table>
<img src="Tulips.jpg" height="150" width="150">
</center>
</form>