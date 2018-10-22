package servicos;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import util.TransacionalCdi;
import dao.PersistenciaDacException;
import dao.TurmaDAO;
import entidades.Turma;

@ApplicationScoped
public class TurmaServices {

	@Inject
	private TurmaDAO dao;

	@TransacionalCdi
	public void save(Turma turma) throws ServiceDacException {
		try {
			dao.save(turma);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException(e.getMessage(), e);
		}
	}

	@TransacionalCdi
	public void update(Turma turma) throws ServiceDacException {

		try {
			dao.update(turma);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException(e.getMessage(), e);
		}
	}

	@TransacionalCdi
	public void delete(Turma turmaId) throws ServiceDacException {
		try {
			dao.delete(turmaId);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException(e.getMessage(), e);
		}
	}

	public Turma getByID(int turmaId) throws ServiceDacException {
		try {
			return dao.getByID(turmaId);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException(e.getMessage(), e);
		}
	}
}
