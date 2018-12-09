<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Spring Project - Home Page</h1>
	<h3>${name}</h3>
	
	<form action="pc" method="get">
	Name: <input type="text" name="firstName"/>
	age: <input type="text" name="age"/>
	<input type="submit" value="Submit"/>
	</form>
	<a href="${pageContext.request.contextPath}/listview">Click Here to List All Products</a>
	<h1>${pageContext.request.contextPath}</h1>
</body>
</html>