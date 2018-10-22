package dao;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.Query;
import javax.persistence.EntityManager;

import entidades.Disciplina;
import util.TransacionalCdi;

@ApplicationScoped
public class DisciplinaDAO {

	@Inject
	private EntityManager manager;

	@TransacionalCdi
	public void save(Disciplina disciplina) throws PersistenciaDacException {
		manager.persist(disciplina);
		}

	@TransacionalCdi
	public Disciplina update(Disciplina disciplina) throws PersistenciaDacException {
		Disciplina resultado = disciplina;
		resultado = manager.merge(disciplina);
		return resultado;
	}

	@TransacionalCdi
	public void delete(Disciplina disciplina) throws PersistenciaDacException {
		disciplina = getByID(disciplina.getIdDisciplina());
		manager.remove(disciplina);
	}

	public Disciplina getByID(int idDisciplina) throws PersistenciaDacException {
		return manager.find(Disciplina.class, idDisciplina);
	}

	@SuppressWarnings("unchecked")
	public List<Disciplina> list() throws PersistenciaDacException {
		Query query = manager.createQuery("from Disciplina", Disciplina.class);
		return query.getResultList();
	}
}
