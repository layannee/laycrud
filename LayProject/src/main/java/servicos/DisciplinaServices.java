package servicos;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import util.TransacionalCdi;
import dao.DisciplinaDAO;
import dao.PersistenciaDacException;
import entidades.Disciplina;

@ApplicationScoped
public class DisciplinaServices {

	@Inject
	private DisciplinaDAO dao = new DisciplinaDAO();

	@TransacionalCdi
	public void save(Disciplina disciplina) throws ServiceDacException {
		try {
			dao.save(disciplina);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException(e.getMessage(), e);
		}
	}
	@TransacionalCdi
	public void update(Disciplina disciplina) throws ServiceDacException {

		try {
			dao.update(disciplina);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException(e.getMessage(), e);
		}
	}

	@TransacionalCdi
	public void delete(Disciplina disciplina) throws ServiceDacException {
		try {
			dao.delete(disciplina);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException(e.getMessage(), e);
		}
	}

	public Disciplina getByID(int disciplinaId) throws ServiceDacException {
		try {
			return dao.getByID(disciplinaId);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException(e.getMessage(), e);
		}
	}
	public List<Disciplina> list() {
		return null;
	}
	

}
