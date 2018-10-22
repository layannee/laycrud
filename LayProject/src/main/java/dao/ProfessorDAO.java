package dao;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidades.Professor;
import util.TransacionalCdi;

@ApplicationScoped
public class ProfessorDAO {

	@Inject
	private EntityManager manager;

	@TransacionalCdi
	public void save(Professor professor) throws PersistenciaDacException {
		manager.persist(professor);
	}

	@TransacionalCdi
	public void update(Professor professor) throws PersistenciaDacException {
		manager.merge(professor);
	}

	public void delete(Professor professor) throws PersistenciaDacException {
		professor = getByID(professor.getIdProfessor());
		manager.remove(professor);
	}

	public Professor getByID(int idProfessor) throws PersistenciaDacException {
		return manager.find(Professor.class, idProfessor);
	}

	@SuppressWarnings("unchecked")
	public List<Professor> list() throws PersistenciaDacException {
		Query query = manager.createQuery("from Professor", Professor.class);
		return query.getResultList();
	}
}
