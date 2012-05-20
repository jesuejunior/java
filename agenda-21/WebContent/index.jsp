<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" href="static/css/bootstrap.min.css" rel="stylesheet" />
<script type="text/javascript" src="static/js/bootstrap.min.js"></script>
<script type="text/javascript" src="static/js/bootstrap-tab.js"></script>
<script type="text/javascript" src="static/js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="static/js/jquery-ui-1.7.3.custom.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Projeto Agenda 21</title>
</head>
<body>
	 <c:import url="cabecalho.jsp" />
    <div class="container">
      <div class="tabbable tabs-left">
        <ul class="nav nav-tabs">
          <li class="active"><a href="#contatos" data-toggle="tab">Contatos</a></li>
          <li><a href="#adiciona-contato" data-toggle="tab">Adicionar Contato</a></li>
          <li><a href="#altera-contato" data-toggle="tab">Alterar Contato</a></li>
        </ul>
        <div class="tab-content">
          <div class="tab-pane active" id="contatos">
            <c:import url="contatos.jsp" />
          </div>
          <div class="tab-pane " id="adiciona-contato">
            <c:import url="adiciona-contato.jsp" />
          </div>
          <div class="tab-pane" id="altera-contato">
            <c:import url="altera-contato.jsp" />
          </div>
        </div>
      </div>
    </div>  
    <script>
    	$(function(){
    		$('#myTab a:[href="#adiciona-contato"]').tab('show');
    	})
    </script>
    
	<c:import url="rodape.jsp"></c:import>
</body>
</html>