$(document).ready(function() {
	
	$('#submitAssunto').click(function() {
	  var assunto = $("#assunto").val();
	  $("#formAssunto").attr("action","/comente-sobre/"+assunto);
	  $("#formAssunto").submit();
	});
	
	$("#formAssunto").validate({
		rules: {
			"comentario.assunto": "required"
		},
		messages: {
			"comentario.assunto": "Preencha o assunto"
		}
	});
	
	$("#formComentario").validate({
		rules: {
			"comentario.assunto": "required",
			"comentario.email": {
				required : true,
				email : true
			},
			"comentario.comentario" : "required"
		},
		messages: {
			"comentario.assunto": "Preencha o assunto",
			"comentario.email" : {
				required : "Informe o email",
				email : "Informe um email v&aacute;lido"
			},
			"comentario.comentario": "Preencha o coment&aacute;rio"
		}
	});
	
});