<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/template/cabecalho.jsp"/>

<a href="<c:url value="/"/>">Novo coment&aacute;rio</a>

<table bordercolor="black" >
	<c:forEach items="${comentarios}" var="comentario">
		<tr>
			<td>Id:</td>
			<td>${comentario.id}</td>
		</tr>
		<tr>	
			<td>E-mail:</td>
			<td>${comentario.email}</td>
		</tr>
		<tr>
			<td>Assunto:</td>	
			<td>${comentario.assunto}</td>
		</tr>
		<tr>
			<td>Coment&aacute;rio:</td>	
			<td>${comentario.comentario}</td>
		</tr>
		<tr>
			<td colspan="2">
				<hr />
			</td>
		</tr>	
	</c:forEach>
</table>

<jsp:include page="/WEB-INF/template/rodape.jsp"/>