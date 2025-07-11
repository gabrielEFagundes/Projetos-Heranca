package com.appbiblioteca.model;

public class Leitor extends Pessoa{
	
	private String matricula;
	
	public Leitor(String nome, String cpf, String matricula) {
		super(nome, cpf);
		this.matricula = matricula;
	}
	
	public Leitor() {
		super();
		this.matricula = "";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void mostrarLeitor() {
		System.out.printf("\n%s\n%s\n%s", getNome(), getCpf(), getMatricula());
	}
}
