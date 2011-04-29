<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/template/cabecalho.jsp"/>

<p>Coment�rios sobre: <b>${assunto}</b> - <a href="<c:url value="/"/>">novo</a></p>

<table bordercolor="black" width="100%">
	<c:forEach items="${comentarios}" var="comentario">
		<tr>
			<td>Id:</td>
			<td class="comentario">${comentario.id}</td>
		</tr>
		<tr>	
			<td>E-mail:</td>
			<td class="comentario">${comentario.email}</td>
		</tr>
		<tr>
			<td>Assunto:</td>	
			<td class="comentario">${comentario.assunto}</td>
		</tr>
		<tr>
			<td style="vertical-align: top;">Coment&aacute;rio:</td>	
			<td class="comentario">${comentario.comentario}</td>
		</tr>
		<tr>
			<td colspan="2">
				<hr />
			</td>
		</tr>	
	</c:forEach>
</table>

<jsp:include page="/WEB-INF/template/rodape.jsp"/>