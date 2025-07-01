package com.appbiblioteca.model;

public class Bibliotecario extends Pessoa{

	private char turno;
	
	public Bibliotecario(String nome, String cpf, char turno) {
		super(nome, cpf);
		this.turno = turno;
	}
	
	public Bibliotecario() {
		super();
		this.turno = ' ';
	}

	public char getTurno() {
		return turno;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}
	
	public void mostrarBibliotecario() {
		System.out.printf("\n%s\n%s\n%s", getNome(), getCpf(), getTurno());
	}
}
