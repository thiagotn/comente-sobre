$(document).ready(function() {
	
	$('#submitAssunto').click(function() {
	  var assunto = $("#assunto").val();
	  $("#formAssunto").attr("action","/comente-sobre/"+assunto);
	  $("#formAssunto").submit();
	});
	
});