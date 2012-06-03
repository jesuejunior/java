<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="six" %>

  <div class="span9">
	<form class="well form-vertical" action="mvc.6" method="POST">
		<fieldset >
		
		<div class="control-group span8">
		<h3><b>Adicionar Contato</b></h3><br />
			
			<label class="control-label" for="nome"> Nome: </label> 
		 	<input type="text" class="input-xlarge" name="nome" /><br />
			<label class="control-label" for="email"> E-mail: </label> 
			<input type="text" class="input-xlarge" name="email" /><br /> 
			
			<label class="control-label" for="endereco"> Endereço: </label> 
			<input type="text" class="input-xlarge" name="endereco" /><br />

			<label class="control-label ui-datepicker-calendar" for="dataNascimento"> Data de nascimento: </label> 
			<six:campoData id="dataNascimento" /> <br /> 
						<input type="hidden" name="action" value="AdicionarContatoAction" />
						<input type="submit" class="btn btn-primary" value="Gravar" /> <input type="reset" class="btn" value="Limpar">
		</div>
		</fieldset>
	</form>
	</div>
