package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor  {

		@Id
		private Integer idProf;
		private String nome;
		private int disciplina;
		private String professor;
		private String turma;
		private String aluno;


public String getAluno() {
	return aluno;
}

public void setAluno(String aluno) {
	this.aluno = aluno;
}

public String getProfessor() {
	return professor;
}

public void setProfessor(String professor) {
	this.professor = professor;
}

public String getTurma() {
	return turma;
}

public void setTurma(String turma) {
	this.turma = turma;
}

public Integer getDisciplina() {
	return disciplina;
}

public void setDisciplina(Integer disciplina) {
	this.disciplina = disciplina;
}

public Integer getIdProfessor() {
	return idProf;
}

public void setIdProfessor(Integer idProfessor) {
	this.idProf = idProfessor;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

@Override
public String toString() {
	return "Professor [idProf=" + idProf + ", nome=" + nome + ", disciplina=" + disciplina
			+ ", professor=" + professor + ", turma=" + turma + ", aluno=" + aluno + "]";
}



}
	
