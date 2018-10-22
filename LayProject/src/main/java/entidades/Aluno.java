package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno {

	@Id
	private int idAluno;
	private int idade;
	private String nome;
	private String disciplina;
	private String professor;
	private String turma;
	
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public String getProfessor() {
		return professor;
	}
	
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public int getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Aluno [idAluno=" + idAluno + ", idade=" + idade + ", nome=" + nome + ", disciplina=" + disciplina
				+ ", professor=" + professor + ", turma=" + turma + "]";
	}
	
}
