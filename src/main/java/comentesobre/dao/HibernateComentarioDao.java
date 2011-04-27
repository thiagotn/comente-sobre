package comentesobre.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import br.com.caelum.vraptor.ioc.Component;

import comentesobre.modelo.Comentario;

@Component
public class HibernateComentarioDao implements ComentarioDao {

	private HibernateTemplate template;
	
	public HibernateComentarioDao(final HibernateTemplate template) {
		this.template = template;
	}
	
	public List<Comentario> lista() {
		return template.loadAll(Comentario.class);
	}

	public void salva(Comentario comentario) {
		template.saveOrUpdate(comentario);
	}

}
