<%@page import="java.util.List"%>
<%@page import="caelum.jdbc.modelo.Contato"%>
<%@page import="caelum.jdbc.dao.ContatoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contatos</title>
</head>
<body>
	<table>
		<%
ContatoDAO dao = new ContatoDAO();
List<Contato> contatos = dao.getLista();

for(Contato contato : contatos){
%>
		<tr>
			<td><%=contato.getNome() %></td>
			<td><%=contato.getEmail() %></td>
			<td> <%=contato.getEndereco() %></td>
			<td><%=contato.getDataNascimento().getTime() %></td>
		</tr>	
		<%				
}
%>
	</table>
</body>
</html>