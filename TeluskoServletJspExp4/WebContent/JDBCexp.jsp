<%@page import="java.sql.*,com.mysql.cj.jdbc.Driver"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Dont forget to add the j connector jar file in WEB-INF/lib. Else it wont work ull get classnot found Exp</p>
	<%
	String url = "jdbc:mysql://localhost:3306/mydemo";
	String uname = "root";
	String pwd = "toor";
	String query = "select * from students";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection(url,uname,pwd);
	Statement st = conn.createStatement();
	ResultSet rs = st.executeQuery(query); 
	while(rs.next()) {
	out.println(rs.getString(1)+" "+rs.getString(2));
	}
	st.close();
	conn.close();
	System.out.println("Donee");
	%>
</body>
</html>