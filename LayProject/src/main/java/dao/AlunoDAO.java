package dao;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidades.Aluno;
import entidades.Disciplina;
import util.TransacionalCdi;

@ApplicationScoped
public class AlunoDAO {

	@Inject
	private EntityManager manager;
	
	@TransacionalCdi
	public void save(Aluno aluno) throws PersistenciaDacException {
		manager.persist(aluno);
		}
	
	@TransacionalCdi
	public void update(Aluno aluno) throws PersistenciaDacException {
		manager.merge(aluno);
	}

	@TransacionalCdi
	public void delete(Aluno aluno) throws PersistenciaDacException {
		aluno = getByID(aluno.getIdAluno());
		manager.remove(aluno);
	}

	public Aluno getByID(long alunoId) throws PersistenciaDacException {
		return manager.find(Aluno.class, alunoId);
	}

	@SuppressWarnings("unchecked")
	public List<Aluno> list() throws PersistenciaDacException {
		Query query = manager.createQuery("from Aluno", Aluno.class);
		return query.getResultList();
	}

	 
	}

