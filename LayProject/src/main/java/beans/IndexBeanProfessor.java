package beans;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import entidades.Professor;
import servicos.ProfessorServices;
import servicos.ServiceDacException;

@Named
@SessionScoped
public class IndexBeanProfessor {

	@Inject
	private ProfessorServices service;
	private Professor professor;

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void adicionarProfessor() throws ServiceDacException {
		service.save(professor);
		professor = new Professor();
	}

	public void editarProfessor() throws ServiceDacException {
		service.update(professor);
	}

	public void removerProfessor() throws ServiceDacException {
		service.delete(professor);
	}

	public IndexBeanProfessor() {
		professor = new Professor();
	}

}
