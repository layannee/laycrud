package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Turma {

	@Id
	private int idTurma;
	private String aluno;
	private String professor;
	private String disciplina;
		
	
	public String getAluno() {
		return aluno;
	}
	
	public void setAluno (String aluno) {
		this.aluno = aluno;
	
	}

	public int getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Turma [idTurma=" + idTurma + ", professor=" + professor + ", disciplina=" + disciplina + "]";
	}

}
