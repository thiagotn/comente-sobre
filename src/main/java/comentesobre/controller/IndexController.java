package comentesobre.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import com.google.common.base.Strings;
import comentesobre.dao.ComentarioDao;
import comentesobre.modelo.Comentario;

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
		
	}

	@Post @Path("/{comentario.assunto}")
	public void form(Comentario comentario) {
		result.include("comentario", comentario);
	}
	
	@Post
	public void salva(Comentario comentario) {
		if((!Strings.isNullOrEmpty(comentario.getComentario())) && (!Strings.isNullOrEmpty(comentario.getEmail()))) {
			comentarioDao.salva(comentario);
		}
		result.redirectTo(IndexController.class).lista();
	}
	
	@Get @Path("/comentarios")
	public void lista() {
		List<Comentario> comentarios = comentarioDao.lista();
		result.include("comentarios", comentarios);
	}
}
