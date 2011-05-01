package comentesobre.dao;

import java.util.List;

import comentesobre.modelo.Comentario;

public interface ComentarioDao {

	List<Comentario> lista(String assunto);

	List<Object[]> listaAssuntos();
	
	void salva(Comentario comentario);
	
}
