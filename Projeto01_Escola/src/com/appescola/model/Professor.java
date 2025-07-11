package com.appescola.model;

public class Professor extends Pessoa{
	
	private String disciplina;
	
	public Professor(String nome, String email, String disciplina) {
		super(nome, email);
		this.disciplina = disciplina;
	}
	
	public Professor() {
		super();
		this.disciplina = "";
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public void mostrarProfessor() {
		System.out.println("\n" + getNome() + "\n" + getEmail() + "\n" + getDisciplina());
	}
}
