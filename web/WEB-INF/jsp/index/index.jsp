<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/template/cabecalho.jsp"/>


<form id="formAssunto" method="post">
	<table>
		<tr>
			<td>
				Sobre o que você deseja comentar?<input type="text" id="assunto" name="comentario.assunto"/>			
			</td>
			<td>
				<input type="submit" id="submitAssunto" name="Enviar"/>			
			</td>	
		</tr>
	</table>
</form>

<jsp:include page="/WEB-INF/template/rodape.jsp"/>