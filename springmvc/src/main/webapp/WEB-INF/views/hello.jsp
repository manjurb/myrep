<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>hello</title>
</head>
<body>
<h1>Welcome to spring MVC</h1>
<%
Integer id=(Integer)request.getAttribute("id");
String name=(String)request.getAttribute("name");
Integer salary=(Integer)request.getAttribute("salary");
out.println("ID = "+id);
out.println("Name = "+name);
out.println("Salary = "+salary);
%>
<br/>
ID:
<b>${id}</b>
Name:
<b>${name}</b>
Salary:
<b>${salary}</b>
</body>
</html>