<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!--meta charset="ISO-8859-1"-->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adicionar contato</title>
</head>
<body>
	<h1>Adicionar contato</h1>
	<hr/>
	<form action = "AgendaServlet" method = "post">
		<input type = "hidden" name = "acao" value = "confirmarCadastro"/>
		<b>Nome: </b><input type = "text" name = "nome"/><br/>
		<b>Numero: </b><input type = "text" name = "numero"/><br/>
		<b>Email: </b><input type = "text" name = "email"/><br/><br/>
		<input type = "submit" value = "Adicionar"/>
	</form>
	<br/><br/>
	<a href="index.jsp">Home</a>
</body>
</html>