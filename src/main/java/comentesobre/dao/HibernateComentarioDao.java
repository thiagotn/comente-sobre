package comentesobre.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import br.com.caelum.vraptor.ioc.Component;

import comentesobre.modelo.Comentario;

@Component
public class HibernateComentarioDao implements ComentarioDao {

	private HibernateTemplate template;
	
	public HibernateComentarioDao(final HibernateTemplate template) {
		this.template = template;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	public List<Comentario> lista(String assunto) {
		Criteria c = template.getSessionFactory().getCurrentSession().createCriteria(Comentario.class);
		c.add(Restrictions.ilike("assunto", assunto, MatchMode.EXACT));
		c.addOrder(Order.asc("data"));
		return c.list();
	}

	public void salva(Comentario comentario) {
		template.saveOrUpdate(comentario);
	}
	
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	public List<Object[]> listaAssuntos() {
		Criteria c = template.getSessionFactory().getCurrentSession().createCriteria(Comentario.class);
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.groupProperty("assunto"));
		pl.add(Projections.rowCount(),"total");
		c.addOrder(Order.desc("total"));
		c.setProjection(pl);
		return c.list();
	}

}
