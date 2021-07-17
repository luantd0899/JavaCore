<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello World!!!</title>
</head>
<body>
	
	<!-- Source code Java -->
	<%=
		Calendar.getInstance().getTime()
	%>
	
	<%!
		int x = 6;
	%>
	
	<%
		out.print(x);
	%>
</body>
</html>