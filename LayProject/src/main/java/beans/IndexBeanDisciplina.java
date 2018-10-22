package beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import entidades.Disciplina;
import servicos.ServiceDacException;
import servicos.DisciplinaServices;

@SuppressWarnings("serial")
@ViewScoped
@Named
public class IndexBeanDisciplina implements Serializable {

	@Inject
	private DisciplinaServices service;
	private List<Disciplina> disciplinas;
	private Disciplina disciplina;

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> usuarios) {
		this.disciplinas = usuarios;
	}

	public void setService(DisciplinaServices service) {
		this.service = service;
	}

	public List<Disciplina> getdisciplinas() {
		return disciplinas;
	}

	public DisciplinaServices getService() {
		return service;
	}

	public void setUsuario(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public void adicionarDisciplinas() throws ServiceDacException {
		service.save(disciplina);
		disciplinas = service.list();
		disciplina = new Disciplina();
	}

	public void editarUsu() throws ServiceDacException {
		service.update(disciplina);
	}

	public void removerUsu() throws ServiceDacException {
		service.delete(disciplina);
	}

	public IndexBeanDisciplina() {
		disciplina = new Disciplina();
	}

}
