package com.appescola.model;

public class Aluno extends Pessoa{
	
	private int serie;
	
	public Aluno(String nome, String email, int serie) {
		super(nome, email);
		this.serie = serie;
	}
	
	public Aluno() {
		super();
		this.serie = 0;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}
	
	public void mostrarAluno() {
		System.out.println("\n" + getNome() + "\n" + getEmail() + "\n" + getSerie());
	}
}