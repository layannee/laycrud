package dao;

import java.util.List;
import javax.persistence.Query;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import entidades.Turma;

@ApplicationScoped
public class TurmaDAO {

	@Inject
	private EntityManager manager;

	public void save(Turma turma) throws PersistenciaDacException {
			update(turma);
		}
	

	public Turma update(Turma turma) throws PersistenciaDacException {
		Turma resultado = turma;
		resultado = manager.merge(turma);
		return resultado;
	}

	public void delete(Turma turma) throws PersistenciaDacException {
		turma = getByID(turma.getIdTurma());
		manager.remove(turma);
	}

	public Turma getByID(int Idturma) throws PersistenciaDacException {
		return manager.find(Turma.class, Idturma);
	}
	
	@SuppressWarnings("unchecked")
	public List<Turma> list() throws PersistenciaDacException {
		Query query = manager.createQuery("from Turma", Turma.class);
		return query.getResultList();
	}
}