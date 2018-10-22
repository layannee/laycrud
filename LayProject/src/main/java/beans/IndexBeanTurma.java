package beans;


import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import entidades.Turma;
import servicos.ServiceDacException;
import servicos.TurmaServices;

@Named
@SessionScoped
public class IndexBeanTurma {

	@Inject
	private TurmaServices service;
	private Turma turma;

	public Turma getTurma() {
		return turma;
	}

	public void setPlanta(Turma turma) {
		this.turma = turma;
	}

	public void adicionarTurma() throws ServiceDacException {
		service.save(turma);
		turma = new Turma();
	}

	public void editarTurma() throws ServiceDacException {
		service.update(turma);
	}

	public void removerTurma() throws ServiceDacException {
		service.delete(turma);
	}
	
	public IndexBeanTurma() {
		turma = new Turma();
	}

	
	
}
