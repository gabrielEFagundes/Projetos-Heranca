package com.appacademia.model;

public class Aluno extends Pessoa{

	private String objetivo;
	
	public Aluno(String nome, int idade, String objetivo) {
		super(nome, idade);
		this.objetivo = objetivo;
	}
	
	public Aluno() {
		super();
		this.objetivo = "";
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	public void mostrarAluno() {
		System.out.printf("%s\n%d anos\n%s", getNome(), getIdade(), getObjetivo());
	}
}
