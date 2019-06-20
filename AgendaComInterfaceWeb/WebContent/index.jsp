<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!--meta charset="ISO-8859-1"-->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>Agenda de Contatos</h1>
	<hr/>
	<b>Selecione uma opção: </b><br/>
	1- <a href="AgendaServlet?acao=cadastrar">Adicionar contatos</a><br/>
	2- <a href="AgendaServlet?acao=remover">Remover contato</a><br/>
	3- <a href="AgendaServlet?acao=procurar">Buscar contato</a><br/>
	4- <a href="AgendaServlet?acao=listar">Listar contatos</a><br/>
	5- <a href="AgendaServlet?acao=atualizar">Atualizar contato</a><br/>
	6- <a href="AgendaServlet?acao=total">Total de contatos</a><br/>
</body>
</html>