<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="six" tagdir="/WEB-INF/tags"%>


	<div class="span8">
	<form class="well form-vertical" action="mvc.6" method="POST">
		<fieldset >
		
		<div class="control-group span9">
		<h3><b>Formulario para alteração de contatos</b></h3><br />
			
			<label class="control-label" for="id"> Id: </label> 
		 	<input type="text" class="input-xlarge" name="id" /><br />
			<label class="control-label" for="nome"> Nome: </label> 
		 	<input type="text" class="input-xlarge" name="nome" /><br />
			<label class="control-label" for="email"> E-mail: </label> 
			<input type="text" class="input-xlarge" name="email" /><br /> 
			
			<label class="control-label" for="endereco"> Endereço: </label> 
			<input type="text" class="input-xlarge" name="endereco" /><br />

			<label class="control-label ui-datepicker-calendar" for="dataNascimento"> Data de nascimento: </label> 
			<six:campoData id="dataNascimento" /> <br /> 
						<input type="hidden" name="action" value="AlterarContatoAction" />
						<input type="submit" class="btn btn-primary" value="Gravar" /> <input type="reset" class="btn" value="Limpar">
		</div>
		</fieldset>
	</form>
	</div>
