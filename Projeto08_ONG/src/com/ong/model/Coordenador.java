package com.ong.model;

public class Coordenador extends Pessoa{

	private String responsabilidade;
	
	public Coordenador(String nome, String cidade, String responsabilidade) {
		super(nome, cidade);
		this.responsabilidade = responsabilidade;
	}
	
	public Coordenador() {
		super();
		this.responsabilidade = "";
	}

	public String getResponsabilidade() {
		return responsabilidade;
	}

	public void setResponsabilidade(String responsabilidade) {
		this.responsabilidade = responsabilidade;
	}
	
	public void mostrarCoordenador() {
		System.out.printf("\n%s\n%s\n%s", getNome(), getCidade(), getResponsabilidade());
	}
}
