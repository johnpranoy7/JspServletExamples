<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"  errorPage="Myerror.jsp"  %>
<%@include file="home.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<%!
		int i=5;
		int j =10;
		int k=0;
	%>
	<%
		k = i + j;
		//int a=4/0;
		out.println("The sum is"+k);
		out.println("The value of z from other jsp is");
	%>
	<%=z %>
</body>
</html>