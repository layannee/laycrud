package beans;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import entidades.Aluno;
import servicos.AlunoServices;
import servicos.ServiceDacException;

@Named
@SessionScoped
public class IndexBeanAluno {

	@Inject
	private AlunoServices service;
	private Aluno aluno;
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public void adicionarAluno() throws ServiceDacException {
		service.save(aluno);
		aluno = new Aluno();
	}

	public void editarAluno(int idAluno) throws ServiceDacException {
		service.update(aluno);
	}

	public void removerAluno() throws ServiceDacException {
		service.delete(aluno);
	}

	public IndexBeanAluno() {
		aluno = new Aluno();
	}

}
