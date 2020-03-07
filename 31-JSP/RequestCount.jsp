<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- visible comment -->
<%--insible to user comment called hidden comment or jsp comment --%>

<!-- declaration tag -->
<%!int count =0;
%>

<!-- scriptlet tag -->
<%
count++;
%>

<!-- expression tag -->
<h1>No of user visited so far = <%= count %></h1>
</body>
</html>