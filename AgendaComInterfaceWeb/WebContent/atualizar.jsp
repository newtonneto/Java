<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atualizar contato</title>
</head>
<body>
	<h1>Atualizar contato</h1>
	<hr/>
	<form action = "AgendaServlet" method = "post">
		<input type = "hidden" name = "acao" value = "confirmarAtualizar"/>
		<b>Nome: </b><input type = "text" name = "nome"/><br/><br/>
		<b>Novo nome: </b><input type = "text" name = "novoNome"/><br/>
		<b>Novo número: </b><input type = "text" name = "novoNumero"/><br/>
		<b>Novo email: </b><input type = "text" name = "novoEmail"/><br/><br/>
		<input type = "submit" value = "Atualizar"/>
	</form>
	<br/><br/>
	<a href="index.jsp">Home</a>
</body>
</html>