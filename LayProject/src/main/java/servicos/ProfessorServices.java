package servicos;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import dao.PersistenciaDacException;
import dao.ProfessorDAO;
import entidades.Professor;
import util.TransacionalCdi;

@ApplicationScoped
public class ProfessorServices {

	@Inject
	private ProfessorDAO dao = new ProfessorDAO();

	@TransacionalCdi
	public void save(Professor professor) throws ServiceDacException {
		try {
			dao.save(professor);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException(e.getMessage(), e);
		}
	}

	@TransacionalCdi
	public void update(Professor professor) throws ServiceDacException {

		try {
			dao.update(professor);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException(e.getMessage(), e);
		}
	}

	@TransacionalCdi
	public void delete(Professor professorId) throws ServiceDacException {
		try {
			dao.delete(professorId);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException(e.getMessage(), e);
		}
	}

	public Professor getByID(int professorId) throws ServiceDacException {
		try {
			return dao.getByID(professorId);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException(e.getMessage(), e);
		}
	}
}
