<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="six" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" href="static/css/bootstrap.min.css" rel="stylesheet"/>
<script type="text/javascript" src="static/js/bootstrap.min.js"></script>
<script type="text/javascript" src="static/js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="static/js/jquery-ui-1.7.3.custom.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Agenda 21 - Adicionar contato</title>
</head>
<body>
	<c:import url="cabecalho.jsp"></c:import>
	<div class="container">
	<form class="well form-vertical" action="adicionaContato" method="POST">
		<fieldset >
		
		<div class="control-group container">
		<h3><b>Adicionar Contato</b></h3><br />
			
			<label class="control-label" for="nome"> Nome: </label> 
		 	<input type="text" class="input-xlarge" name="nome" /><br />
			<label class="control-label" for="email"> E-mail: </label> 
			<input type="text" class="input-xlarge" name="email" /><br /> 
			
			<label class="control-label" for="endereco"> Endereço: </label> 
			<input type="text" class="input-xlarge" name="endereco" /><br />

			<label class="control-label ui-datepicker-calendar" for="dataNascimento"> Data de nascimento: </label> 
			<six:campoData id="dataNascimento" /> <br /> 
						<input type="submit" class="btn btn-primary" value="Gravar" /> <input type="reset" class="btn" value="Limpar">
		</div>
		</fieldset>
	</form>
	</div>
	<c:import url="rodape.jsp"></c:import>
</body>
</html>
