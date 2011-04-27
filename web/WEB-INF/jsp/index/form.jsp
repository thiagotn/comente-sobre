<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/template/cabecalho.jsp"/>


<form action="<c:url value="/index/salva"/>" method="post">
	<table border="1px">
		<tr>
			<td>
				Assunto: <input type="text" name="comentario.assunto" value="${comentario.assunto}"/>			
			</td>
		</tr>
		<tr>	
			<td>
				E-mail: <input type="text" name="comentario.email" value="${comentario.email}"/>			
			</td>
		</tr>
		<tr>			
			<td style="vertical-align: top;">
				Comentário:<textarea name="comentario.comentario" rows="20" cols="50">${comentario.comentario}</textarea>			
			</td>
		</tr>
		<tr>				
			<td colspan="2" align="right">
				<input type="submit" name="Enviar"/>			
			</td>	
		</tr>
	</table>
</form>

<jsp:include page="/WEB-INF/template/rodape.jsp"/>