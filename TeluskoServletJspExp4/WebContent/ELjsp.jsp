<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); //Http 1.1
response.setHeader("Pragma", "no-cache");//HTTP 1.0
response.setHeader("expires","0");//Proxies
%>
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/mydemo" user="root" password="toor"/>
	<sql:query var="rs" dataSource="${db}">select * from students</sql:query>
	<c:forEach items="${rs.rows}" var="stud">
		<c:out value="${stud.sno}"></c:out>
		<c:out value="${stud.sname}"></c:out><br>
	</c:forEach>
</body>
</html>