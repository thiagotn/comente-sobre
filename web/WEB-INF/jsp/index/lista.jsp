<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/template/cabecalho.jsp"/>

<table border="1px" width="100%">
	<tr>
		<td>Id</td>
		<td>E-mail</td>
		<td>Assunto</td>
		<td>Comentário</td>
	</tr>
	<c:forEach items="${comentarios}" var="comentario">
		<tr>
			<td>${comentario.id}</td>
			<td>${comentario.assunto}</td>
			<td>${comentario.email}</td>
			<td>${comentario.comentario}</td>
		</tr>	
	</c:forEach>
</table>

<jsp:include page="/WEB-INF/template/rodape.jsp"/>