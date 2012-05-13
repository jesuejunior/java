<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ attribute name="id" required="true" %>
<input type="text" id="${id}" name="${id}" />
<script type="text/javascript">
	$.datepicker.setDefaults($.datepicker.regional["pt-BR"]);
	$("#${id}").datepicker({
		
		dateFormat: 'dd/mm/yy'});

</script>
