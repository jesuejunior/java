<%@ page import="java.util.List"%>
<%@ page import="caelum.jdbc.modelo.Contato"%>
<%@ page import="caelum.jdbc.dao.ContatoDAO, java.text.DateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" href="static/css/ui-darkness/jquery-ui-1.8.20.custom.css" rel="stylesheet"/>
<link type="text/css" href="static/css/bootstrap.min.css" rel="stylesheet"/>
<script type="text/javascript" src="static/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contatos</title>
</head>
<body>
	<!--<c:import url="cabecalho.jsp"></c:import> -->
	<!--  Inicializa o DAO -->
	<jsp:useBean id="dao" class="caelum.jdbc.dao.ContatoDAO" />
	<jsp:useBean id="contato" class="caelum.jdbc.modelo.Contato" />
	<table class="table table-striped table-bordered table-condensed container">
		<tr>
			<td><center><b>Nome</b></center></td>
			<td><center><b>Email</b></center></td>
			<td><center><b>Endereço</b></center></td>
			<td><center><b>Data de Nascimento</b></center></td>
		</tr>
		<c:forEach items="${dao.lista}" var="contato">
			<tr>
				<td> ${contato.nome}</td>
				<td><c:choose>
						<c:when test="${not empty contato.email}">
							<a href="mailto:${contato.email}">${contato.email}</a></td>
						</c:when>
				<c:otherwise>
					Email não cadastrado.
						</c:otherwise>
				</c:choose>
				<td>${contato.endereco}</td>
				<td><fmt:formatDate value="${contato.dataNascimento.time}"	pattern="dd/MM/yyyy" /></td>
				<td><form action="mvc?id=${contato.id}" method="POST">  <input type="hidden" name="action" value="RemoverContatoAction" /> 
					<center><input type="submit" class="btn btn-danger" value="Remover" /></center></td>
					</form>
			</tr>
		</c:forEach>
	</table>
</body>
</html>