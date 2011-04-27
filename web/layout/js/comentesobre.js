$(document).ready(function() {
	
	$('#submitAssunto').click(function() {
//	  alert('Certinho');
	  var assunto = $("#assunto").val();
	  $("#formAssunto").attr("action","/comente-sobre/"+assunto);
	  $("#formAssunto").submit();
	});
	
});