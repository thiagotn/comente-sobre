<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/template/cabecalho.jsp"/>

<form id="formAssunto" method="post">
<input type="hidden" name="actionFormAssunto" value="actionFormAssunto"/>
	<table align="center"  width="100%">
		<tr>
			<td align="center">
				Sobre o que você deseja comentar?
			</td>
		</tr>
		<tr>
			<td align="center">		
				<input type="text" id="assunto" size="60" name="comentario.assunto"/>			
			</td>
		</tr>	
		<tr>	
			<td align="center">
				<input type="submit" id="submitAssunto" value="Enviar"/>			
			</td>	
		</tr>
	</table>
</form>

<jsp:include page="/WEB-INF/template/rodape.jsp"/>