<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!--meta charset="ISO-8859-1"-->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Remover contato</title>
</head>
<body>
	<h1>Remover contato</h1>
	<hr/>
	<form action = "AgendaServlet" method = "post">
		<input type = "hidden" name = "acao" value = "confirmarRemover"/>
		<b>Nome: </b><input type = "text" name = "nome"/><br/><br/>
		<input type = "submit" value = "Remover"/>
	</form>
	<br/><br/>
	<a href="index.jsp">Home</a>
</body>
</html>