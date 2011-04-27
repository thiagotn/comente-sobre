<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/template/cabecalho.jsp"/>


<form action="<c:url value="/salva"/>" method="post">
	<table>
		<tr>
			<td>
				Assunto: <input type="text" name="comentario.assunto" value="${comentario.assunto}"/>			
			</td>
			<td>
				E-mail: <input type="text" name="comentario.email" value="${comentario.email}"/>			
			</td>
			<td>
				Comentário: <input type="text" name="comentario.assunto" value="${comentario.comentario}"/>			
			</td>			
			<td>
				<input type="submit" name="Enviar"/>			
			</td>	
		</tr>
	</table>
</form>

<jsp:include page="/WEB-INF/template/rodape.jsp"/>