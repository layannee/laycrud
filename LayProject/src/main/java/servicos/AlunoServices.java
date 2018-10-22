package servicos;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import util.TransacionalCdi;
import dao.PersistenciaDacException;
import dao.AlunoDAO;
import entidades.Aluno;

@ApplicationScoped
public class AlunoServices {

	@Inject
	private AlunoDAO dao = new AlunoDAO();

	@TransacionalCdi
	public void save(Aluno aluno) throws ServiceDacException {
		try {
			dao.save(aluno);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException(e.getMessage(), e);
		}
	}

	@TransacionalCdi
	public void update(Aluno aluno) throws ServiceDacException {

		try {
			dao.update(aluno);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException(e.getMessage(), e);
		}
	}

	@TransacionalCdi
	public void delete(Aluno alunoId) throws ServiceDacException {
		try {
			dao.delete(alunoId);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException(e.getMessage(), e);
		}
	}

	public Aluno getByID(int alunoId) throws ServiceDacException {
		try {
			return dao.getByID(alunoId);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException(e.getMessage(), e);
		}
	}
}
