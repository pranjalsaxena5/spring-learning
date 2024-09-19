<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
	<h1>This home page</h1>
	<h1>Called by home controller</h1>

	<%
	String name = (String) request.getAttribute("name");
	int id = (int) request.getAttribute("id");
	List<String> friends = (List<String>) request.getAttribute("friends");
	%>

	<h4>
		Name is
		<%=name%></h4>
	<h4>
		ID is
		<%=id%></h4>
	<h4>
		List is
		<%=friends%></h4>


	<h4>List from Loop</h4>

	<%
	for (String f : friends) {
	%>
	<h5>
		<%=f%>
	</h5>
	<%
	}
	%>
	<h1>url /home</h1>
</body>
</html>