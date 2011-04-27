package comentesobre.dao;

import java.util.List;

import comentesobre.modelo.Comentario;

public interface ComentarioDao {

	List<Comentario> lista();

	void salva(Comentario comentario);
	
}
