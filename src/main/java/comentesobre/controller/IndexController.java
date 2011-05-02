package comentesobre.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import com.google.common.base.Strings;
import comentesobre.dao.ComentarioDao;
import comentesobre.modelo.Comentario;
import comentesobre.util.StringUtil;

@Resource
public class IndexController {

	private ComentarioDao comentarioDao;
	private Result result;
	
	public IndexController(ComentarioDao comentarioDao, Result result) {
		this.comentarioDao = comentarioDao;
		this.result = result;
	}
	
	@Path("/")
	public void index() { 
		listaTopAssuntos();
	}

	@Post @Path("/{comentario.assunto}")
	public void form(Comentario comentario) {
		String assunto = comentario.getAssunto();
		try {
			assunto = URLDecoder.decode(assunto,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		comentario.setAssunto(assunto);
		result.include("comentario", comentario);
		listaTopAssuntos();
	}
	
	@Post
	public void salva(Comentario comentario) {
		String assunto = comentario.getAssunto();
		comentario.setData(Calendar.getInstance());
		assunto = StringUtil.converteStringParaUri(assunto);
		if((!Strings.isNullOrEmpty(comentario.getComentario())) && (!Strings.isNullOrEmpty(comentario.getEmail()))) {
			comentario.setAssunto(assunto);
			comentarioDao.salva(comentario);
		}
		result.redirectTo(IndexController.class).lista(assunto);
	}
	
	@Get @Path("/comentarios/sobre/{assunto}")
	public void lista(String assunto) {
		List<Comentario> comentarios = comentarioDao.lista(assunto);
		result.include("comentarios", comentarios);
		result.include("assunto", assunto);
		listaTopAssuntos();
	}
	
	private void listaTopAssuntos() {
		List<Object[]> assuntos = comentarioDao.listaAssuntos();
		result.include("assuntos", assuntos);
	}
}
