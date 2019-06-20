<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<!--meta charset="ISO-8859-1"-->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Total contatos</title>
</head>
<body>
	<h1>Total contatos</h1>
	<hr/>
	Número total de contatos: <%=request.getAttribute("totalContatos")%>
	<br/><br/>	
	<a href="index.jsp">Home</a>
</body>
</html>