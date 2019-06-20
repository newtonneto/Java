<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar contatos</title>
</head>
<body>
	<h1>Listar contatos</h1>
	<hr/>
	<c:if test="${empty listaContatosEncontrados}">
		<b>Nenhum contato encontrado</b>
	</c:if>
	
	<table border = "1">
		<tr>
			<td><b>Nome</b></td>
			<td><b>Numero</b></td>
			<td><b>Email</b></td>
		</tr>
		<c:forEach var = "view"	items = "${listaContatosEncontrados}">
			<tr>
				<td><c:out value = "${view.getNome()}"></c:out></td>
				<td><c:out value = "${view.getNumero()}"></c:out></td>
				<td><c:out value = "${view.getEmail()}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
	<br/><br/>	
	<a href="index.jsp">Home</a>
</body>
</html>