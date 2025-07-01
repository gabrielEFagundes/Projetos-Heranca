package com.ong.model;

public class Voluntario extends Pessoa{

	private String areaAtuacao;
	
	public Voluntario(String nome, String cidade, String areaAtuacao) {
		super(nome, cidade);
		this.areaAtuacao = areaAtuacao;
	}
	
	public Voluntario() {
		super();
		this.areaAtuacao = "";
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	
	public void mostrarVoluntario() {
		System.out.printf("\n%s\n%s\n%s", getNome(), getCidade(), getAreaAtuacao());
	}
}
